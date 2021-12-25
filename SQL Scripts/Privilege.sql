﻿USE QLDonHang

--Tạo login vào sql server
--CREATE LOGIN DT_LOGIN WITH PASSWORD = '123'
--CREATE LOGIN KH_LOGIN WITH PASSWORD = '123'
--CREATE LOGIN TX_LOGIN WITH PASSWORD = '123'
--CREATE LOGIN NV_LOGIN WITH PASSWORD = '123'
--CREATE LOGIN QT_LOGIN WITH PASSWORD = '123'

--Tạo user: trong ứng dụng bán hàng có người dùng:
--CREATE USER DT1  FOR LOGIN DT_LOGIN
--CREATE USER KH1  FOR LOGIN KH_LOGIN
--CREATE USER TX1  FOR LOGIN TX_LOGIN
--CREATE USER NV1  FOR LOGIN NV_LOGIN
--CREATE USER QT1  FOR LOGIN QT_LOGIN

--View đối tác - sản phẩm
GO
CREATE VIEW DTV_DTSANPHAM
AS 
SELECT *
FROM TAIKHOAN TK JOIN SANPHAM SP ON TK.MATK = SP.MADT
WHERE TK.TENTK = CURRENT_USER



--View đối tác - chi nhánh
GO
CREATE VIEW DTV_DTCHINHANH
AS SELECT*
FROM TAIKHOAN TK JOIN CHINHANH CN ON TK.MATK = CN.MADT
WHERE TK.TENTK = CURRENT_USER


--View đối tác - đơn đặt hàng
GO
CREATE or ALTER 
VIEW DTV_DTDONHANG
AS
SELECT MADH, DONHANG.MASP, SOLUONG, SANPHAM.DONGIA,
    TONGTIEN, DIACHIGIAOHANG, THOIGIANLAP, TRANGTHAI
FROM (TAIKHOAN TK JOIN SANPHAM ON TK.MATK = SANPHAM.MADT) JOIN DONHANG ON DONHANG.MASP = SANPHAM.MASP
WHERE TK.TENTK = CURRENT_USER


--View đối tác
GO
CREATE VIEW DTV_DOITAC
AS
SELECT  TENDT, DAIDIENDT, EMAILDT, SOCHINHANHDK, TONGSODONHANG, LOAIHANGVANCHUYEN, DOANHTHU
FROM TAIKHOAN TK JOIN DOITAC DT ON TK.MATK = DT.MADT
WHERE TK.TENTK = CURRENT_USER


--View đối tác - hợp đồng
GO
CREATE VIEW DTV_DTHOPDONG
AS
SELECT*
FROM TAIKHOAN TK JOIN HOPDONG HD ON TK.MATK = HD.MADT
WHERE TK.TENTK = CURRENT_USER


-- View khách hàng - sản phẩm
GO
CREATE VIEW KHV_SANPHAM
AS
SELECT *
FROM TAIKHOAN TK JOIN SANPHAM SP ON TK.MATK = SP.MADT 
WHERE TK.TENTK = CURRENT_USER


--View khách hàng - đơn hàng
GO
CREATE VIEW KHV_DONHANG
AS SELECT *
FROM TAIKHOAN TK JOIN DONHANG DH ON TK.MATK = DH.MAKH
WHERE TK.TENTK = CURRENT_USER


--View khách hàng
GO
CREATE VIEW KHV_KHACHHANG
AS SELECT KH.*
FROM TAIKHOAN TK JOIN KHACHHANG KH ON TK.MATK = KH.MAKH
WHERE TK.TENTK = CURRENT_USER


--View tài xế - tài xế
GO
CREATE VIEW TXV_DTTX
AS SELECT TX.*
FROM TAIKHOAN TK JOIN TAIXE TX ON TK.MATK = TX.MATX
WHERE TK.TENTK = CURRENT_USER


--View tài xế - đơn hàng
GO
CREATE VIEW TXV_DTDH
AS SELECT TINHTRANG
FROM TAIKHOAN TK JOIN DONHANG DH ON TK.MATK = DH.MATX
WHERE TK.TENTK = CURRENT_USER

GO
CREATE ROLE DT
CREATE ROLE KH
CREATE ROLE	TX
CREATE ROLE	QT
CREATE ROLE NV

--Thêm user vào role để tiết kiệm thời gian cấp quyền cho số lượng lớn user
EXEC SP_ADDROLEMEMBER 'DT' ,'DT1'
EXEC SP_ADDROLEMEMBER 'KH' ,'KH1'
EXEC SP_ADDROLEMEMBER 'TX' ,'TX1'
EXEC SP_ADDROLEMEMBER 'QT' ,'QT1'
EXEC SP_ADDROLEMEMBER 'NV' ,'NV1'

--CẤP QUYỀN CHO ROLE
--Gán quyền cho đối tác
GRANT SELECT, INSERT, DELETE, UPDATE ON SANPHAM TO DT
GRANT UPDATE ON DONHANG(TINHTRANG) TO DT
GRANT SELECT ON DONHANG TO DT
GRANT INSERT, UPDATE ON DOITAC TO DT
GRANT SELECT ON HOPDONG TO DT

GRANT SELECT, UPDATE, INSERT, DELETE ON DTV_DTSANPHAM TO DT
GRANT SELECT, UPDATE, INSERT, DELETE ON DTV_DTCHINHANH TO DT
GRANT SELECT, UPDATE ON DTV_DTDONHANG TO DT
GRANT SELECT, INSERT, UPDATE ON DTV_DOITAC TO DT
GRANT SELECT ON DTV_DTHOPDONG TO DT

GRANT EXEC ON GIAM_GIA_SP_DOITAC TO DT
GRANT EXEC ON TANG_GIA_SP_DOITAC TO DT
GRANT EXEC ON TANG_GIA_SP_DOITAC_FIX TO DT
GRANT EXEC ON TANG_GIA_SP_DOITAC_DL TO DT
GRANT EXEC ON GIAM_GIA_SP_DOITAC_DL TO DT

--Gán quyền cho tài xế
GRANT SELECT, INSERT ON TAIXE TO TX
GRANT UPDATE ON TAIXE(HOTX,TENTX,SDTTX,DIACHITX,EMAILTX,TKNGANHANG,PHITHECHAN,BIENSOXE) TO TX
GRANT UPDATE ON DONHANG(TINHTRANG) TO TX
GRANT SELECT ON DONHANG TO TX

GRANT SELECT, INSERT, UPDATE ON TXV_DTTX TO TX
GRANT SELECT, UPDATE ON TXV_DTDH TO TX

--Gán quyền cho hhách hàng
GRANT SELECT, INSERT, UPDATE ON KHACHHANG TO KH
GRANT SELECT ON SANPHAM TO KH
GRANT SELECT ON DONHANG TO KH

GRANT SELECT, UPDATE, INSERT, DELETE ON KHV_SANPHAM TO KH
GRANT SELECT ON KHV_DONHANG TO KH
GRANT SELECT, INSERT, UPDATE ON KHV_KHACHHANG TO KH

-- Gán quyền cho nhân viên
GRANT SELECT, INSERT, DELETE, UPDATE ON HOPDONG TO NV
GRANT SELECT, UPDATE ON TAIKHOAN(MATKHAU) TO NV

--Gán quyền cho admin
GRANT SELECT, INSERT, DELETE, UPDATE ON TAIKHOAN TO QT
