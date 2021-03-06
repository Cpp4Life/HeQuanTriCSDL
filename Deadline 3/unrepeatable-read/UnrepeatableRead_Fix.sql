USE QLDonHang
GO
CREATE OR ALTER
PROC USP_CAU11_TX --TÀI XẾ XEM TÌNH TRẠNG ĐƠN HÀNG
	@madonhang CHAR(20),
	@matx CHAR(10)
AS
SET TRAN ISOLATION LEVEL REPEATABLE READ
BEGIN TRAN
	BEGIN TRY
	IF NOT EXISTS (SELECT * FROM TAIXE WHERE MATX = @matx)
	BEGIN
	    PRINT N'TÀI XẾ KHÔNG TỒN TẠI'
	       ROLLBACK TRAN
	       RETURN 0
	END
	
	IF NOT EXISTS (SELECT * FROM DONHANG WHERE MADH = @madonhang)
	BEGIN
	    PRINT N'ĐƠN HÀNG KHÔNG TỒN TẠI'
	        ROLLBACK TRAN
	        RETURN 0
	END
	IF NOT EXISTS (SELECT * FROM DONHANG WHERE MADH = @madonhang AND MATX = @matx)
	BEGIN
	    PRINT N'TÀI XẾ KHÔNG CÓ ĐƠN HÀNG TRÊN'
	        ROLLBACK TRAN
	        RETURN 0
	END
	WAITFOR DELAY '00:00:05'
	------------------------------
	
	SELECT TINHTRANG 
	FROM DONHANG 
	WHERE MATX = @matx AND MADH = @madonhang

	END TRY
	BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 0
	END CATCH
COMMIT TRAN
RETURN 1
GO
CREATE OR ALTER
PROC USP_CAU11_DT   --ĐỐI TÁC SỬA TÌNH TRẠNG ĐƠN HÀNG  
	@madonhang CHAR(20), 
	@madt CHAR(10), 
	@tinhtrang INT
AS
BEGIN TRAN
	BEGIN TRY
	IF NOT EXISTS (SELECT * FROM DOITAC WHERE MADT = @madt)
	BEGIN
		PRINT N'ĐỐI TÁC KHÔNG TỒN TẠI'
		ROLLBACK TRAN
		RETURN 0
	END
	
	IF NOT EXISTS (SELECT * FROM DONHANG WHERE MADH = @madonhang)
	BEGIN
	    PRINT N'ĐƠN HÀNG KHÔNG TỒN TẠI'
	    ROLLBACK TRAN
	    RETURN 0
	END
	
	IF NOT EXISTS (SELECT * FROM DONHANG WHERE MADH = @madonhang AND MADT = @madt)
	BEGIN
	    PRINT N'ĐỐI TÁC KHÔNG CÓ ĐƠN HÀNG TRÊN'
	        ROLLBACK TRAN
	        RETURN 0
	END
	
	IF @tinhtrang > 3 OR @tinhtrang <= 0 OR
	    @tinhtrang <= (SELECT TINHTRANG FROM DONHANG WHERE MADT = @madt AND MADH = @madonhang)
	BEGIN
	    PRINT N'CẬP NHẬT TÌNH TRẠNG KHÔNG HỢP LỆ'
	    ROLLBACK TRAN
	    RETURN 0
	END
	------------------------------
	UPDATE DONHANG
	SET TINHTRANG = @tinhtrang
	WHERE MADT = @madt AND MADH = @madonhang
	
	END TRY
	BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 0
	END CATCH
COMMIT TRAN
RETURN 1


