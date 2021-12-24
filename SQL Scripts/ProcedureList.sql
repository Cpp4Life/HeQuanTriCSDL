use QLDonHang
GO
CREATE OR ALTER PROCEDURE sp_ThanhTien(
	@soLuong INT,
	@giaSanPham MONEY,
	@tongTien INT OUT
)
AS
BEGIN
	IF(@soLuong <= 0)
	BEGIN
		PRINT N'Số lượng không hợp lệ'
		RETURN
	END
	
	SET @tongTien = @soLuong * @giaSanPham;
END
GO
CREATE OR ALTER PROCEDURE sp_KiemTraKVHD(
	@KVHD NVARCHAR(50),
	@DCGH NVARCHAR(50)
)
AS
BEGIN
	IF(LEN(@KVHD) = 0 OR @KVHD = '' OR @KVHD = NULL)
	BEGIN
		PRINT N'Khu vực hoạt động không hợp lệ'
		RETURN
	END
	IF(LEN(@DCGH) = 0 OR @DCGH = '' OR @DCGH = NULL)
	BEGIN
		PRINT N'Địa chỉ giao hàng không hợp lệ'
		RETURN
	END
	DECLARE @districtIndex INT
	SELECT @districtIndex = CHARINDEX(N'QUẬN', DONHANG.DIACHIGIAOHANG) FROM DONHANG

	DECLARE @cityIndex INT
	SELECT @cityIndex = CHARINDEX('TPHCM', DONHANG.DIACHIGIAOHANG) FROM DONHANG

	DECLARE @QUAN_DCGH NVARCHAR(50)

	SELECT @QUAN_DCGH = (SUBSTRING(DIACHIGIAOHANG, @districtIndex , @cityIndex - @districtIndex))
	FROM DONHANG

	IF(@KVHD != @QUAN_DCGH)
	BEGIN
		PRINT N'Khu vực hoạt động không trùng với địa chỉ giao hàng'
		RETURN 0
	END
	RETURN 1
END
GO
DECLARE @DCGH NVARCHAR(50)
SELECT @DCGH = DIACHIGIAOHANG FROM DONHANG

DECLARE @KVHD NVARCHAR(50)
SELECT @KVHD = KVHD FROM TAIXE

DECLARE @MATCH INT
EXEC @MATCH = sp_KiemTraKVHD @KVHD, @DCGH
PRINT @MATCH
GO

--Ràng buộc R1: Số chi nhánh của bảng đối tác bằng 
--số chi nhánh của đối tác đó trong bảng chi nhánh. 
--(thêm, xóa chi nhánh của đối tác → số chi nhánh)

CREATE OR ALTER 
TRIGGER TG_CHINHANH_INSERT
ON CHINHANH FOR INSERT
AS
BEGIN
	UPDATE HOPDONG
	SET SOCHINHANH = SOCHINHANH + 1
	WHERE MAHD IN (SELECT DISTINCT inserted.MAHD FROM inserted)
END


GO
CREATE OR ALTER 
TRIGGER TG_CHINHANH_DELETE
ON CHINHANH FOR INSERT
AS
BEGIN
	UPDATE HOPDONG
	SET SOCHINHANH = SOCHINHANH - 1
	WHERE MAHD IN (SELECT DISTINCT deleted.MAHD FROM deleted)
END



--Ràng buộc R2: Doanh thu của đối tác được tính bằng tổng số tiền sản phẩm của đối tác bán ra trong vòng 1 tháng 
--(Tổng số tiền sản phẩm được tính bằng số tiền của tất cả các hóa đơn của đối tác đó). 
--Sau 1 tháng doanh thu sẽ được khởi tạo lại.
GO
CREATE PROC PROC_TIM_DOANH_THU_DOITAC
AS
BEGIN
	UPDATE DOITAC
	SET DOANHTHU = (SELECT SUM(DH.TONGTIEN)
					FROM DONHANG DH
					WHERE MONTH(DH.THOIGIANLAP) = MONTH(GETDATE())
					AND YEAR(DH.THOIGIANLAP) = YEAR(GETDATE())
					AND DH.MADT = DOITAC.MADT)
END