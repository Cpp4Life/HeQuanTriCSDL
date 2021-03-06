CREATE DATABASE QLDonHang
GO
USE QLDonHang
GO
CREATE TABLE LOAITAIKHOAN(
  MALOAITK	INT PRIMARY KEY,
  LOAITK	VARCHAR(10)
  )

GO
CREATE TABLE TAIKHOAN(
  MATK		CHAR(10) PRIMARY KEY,
  TENTK		NVARCHAR(15) NOT NULL UNIQUE,
  MATKHAU	VARCHAR(8) NOT NULL,
  TRANGTHAI BIT NOT NULL,
  MALOAITK	INT REFERENCES LOAITAIKHOAN(MALOAITK) NOT NULL,
  CONSTRAINT TAIKHOAN_ALTERPK UNIQUE (MATK,MALOAITK)
  )

GO 
CREATE TABLE KHACHHANG(
  MAKH		CHAR(10) PRIMARY KEY,
  MALOAITK	AS 1 PERSISTED, --khách hàng
  HOKH		NVARCHAR(10),
  TENKH		NVARCHAR(20),
  SDTKH		CHAR(10),
  DIACHIKH	NVARCHAR(50),
  EMAILKH	VARCHAR(20),
  FOREIGN KEY (MAKH,MALOAITK) REFERENCES TAIKHOAN(MATK,MALOAITK)
)

GO
CREATE TABLE TAIXE(
  MATX			CHAR(10) PRIMARY KEY,
  MALOAITK		AS 2 PERSISTED, --tài xế
  HOTX			NVARCHAR(10),
  TENTX			NVARCHAR(20),
  SDTTX			CHAR(10),
  DIACHITX		NVARCHAR(50),
  EMAILTX		VARCHAR(20),
  TKNGANHANG	VARCHAR(15),
  PHITHECHAN	BIT,
  FOREIGN KEY (MATX,MALOAITK) REFERENCES TAIKHOAN(MATK,MALOAITK)
)
ALTER TABLE TAIXE ADD BIENSOXE VARCHAR(10); 
ALTER TABLE TAIXE ADD KVHD NVARCHAR(50);

GO
CREATE TABLE DOITAC(
  MADT				CHAR(10) PRIMARY KEY,
  MALOAITK			AS 3 PERSISTED, --đối tác
  TENDT				NVARCHAR(20),
  DAIDIENDT			NVARCHAR(20),
  DIACHIDT			NVARCHAR(50),
  EMAILDT			VARCHAR(20),
  SOCHINHANHDK		INT CHECK(SOCHINHANHDK >=0),
  TONGSODONHANG		INT,
  DOANHTHU			INT,
  LOAIHANGVANCHUYEN VARCHAR(20),
  FOREIGN KEY (MADT,MALOAITK) REFERENCES TAIKHOAN(MATK,MALOAITK)
)

GO
CREATE TABLE NHANVIEN(
  MANV		CHAR(10) PRIMARY KEY,
  HONV		NVARCHAR(10),
  TENNV		NVARCHAR(20),
  MALOAITK	AS 4 PERSISTED, --nhân viên
  FOREIGN KEY (MANV,MALOAITK) REFERENCES TAIKHOAN(MATK,MALOAITK)
)

GO
CREATE TABLE QUANTRIVIEN(
  MAQTV		CHAR(10) PRIMARY KEY,
  HOQTV		NVARCHAR(10),
  TENQTV	NVARCHAR(20),
  MALOAITK	AS 5 PERSISTED, --quản trị viên
  FOREIGN KEY (MAQTV,MALOAITK) REFERENCES TAIKHOAN(MATK,MALOAITK)
)


GO
CREATE TABLE HOPDONG(
  MAHD			CHAR(10) PRIMARY KEY,
  MADT			CHAR(10),
  DAIDIENHD		NVARCHAR(20),
  SOCHINHANH	INT CHECK(SOCHINHANH > 0),
  NGAYLAP		DATE,
  NGAYKETTHUC	DATE,
  CONSTRAINT FK_HD_DT FOREIGN KEY(MADT) REFERENCES DOITAC(MADT),
  CONSTRAINT TIME_LOGIC CHECK(NGAYLAP< NGAYKETTHUC)
  )

  GO
CREATE TABLE CHINHANH(
  MACN		CHAR(3) PRIMARY KEY,
  DIACHICN	NVARCHAR(50),
  SODONHANG INT,
  MADT		CHAR(10),
  MAHD		CHAR(10),
  CONSTRAINT FK_CN_DT FOREIGN KEY(MADT) REFERENCES DOITAC(MADT),
  CONSTRAINT FK_CN_HD FOREIGN KEY(MAHD) REFERENCES HOPDONG(MAHD)
)

GO
CREATE TABLE SANPHAM(
  MASP		CHAR(10) PRIMARY KEY,
  TENSP		NVARCHAR(20),
  DONGIA	INT,
  MADT		CHAR(10),
  CONSTRAINT FK_SP_DT FOREIGN KEY(MADT) REFERENCES DOITAC(MADT),
  CONSTRAINT SANPHAM_ALTERPK UNIQUE (MASP,DONGIA)
  )

    GO
  CREATE TABLE LOAITINHTRANG(
	MATT	INT PRIMARY KEY,
	TENTT	NVARCHAR(20)
  )

GO
CREATE TABLE DONHANG(
  MADH				CHAR(15) PRIMARY KEY,
  MADT				CHAR(10) NOT NULL,
  MAKH				CHAR(10) NOT NULL,
  MATX				CHAR(10),
  MASP				CHAR(10) NOT NULL,
  DIACHIGIAOHANG	NVARCHAR(50) NOT NULL,
  SOLUONG			INT NOT NULL CHECK(SOLUONG >0),
  DONGIA			INT NOT NULL,
  TONGTIEN			INT,
  THOIGIANLAP		DATETIME,
  TINHTRANG			INT,
  CONSTRAINT FK_DH_DT FOREIGN KEY(MADT) REFERENCES DOITAC(MADT),
  CONSTRAINT FK_DH_KH FOREIGN KEY(MAKH) REFERENCES KHACHHANG(MAKH),
  CONSTRAINT FK_DH_TX FOREIGN KEY(MATX) REFERENCES TAIXE(MATX),
  --CONSTRAINT FK_DH_SP FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP),
  CONSTRAINT FK_DH_TT FOREIGN KEY(TINHTRANG) REFERENCES LOAITINHTRANG(MATT),
  CONSTRAINT FK_DH_DONGIA FOREIGN KEY(MASP,DONGIA) REFERENCES SANPHAM(MASP,DONGIA)
  )

  GO
CREATE TABLE DANGBAN(
	MACN		CHAR(3),
	MASP		CHAR(10),
	SOLUONG		INT,
	CONSTRAINT FK_DANGBAN_CN FOREIGN KEY(MACN) REFERENCES CHINHANH(MACN),
	CONSTRAINT FK_DANGBAN_SP FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP)
  )

  --TRIGGER
  --tongsodon hang = sodonhang của mỗi chi nhánh
  --tổng tiền hóa đơn = số lượng x đơn giá
  --hóa đơn đơn giá refferences sẩn phẩm đơn giá
  --số chi nhánh  = số chi nhánh đã đăng ký
