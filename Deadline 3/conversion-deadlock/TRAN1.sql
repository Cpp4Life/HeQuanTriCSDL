﻿USE QLDonHang
SELECT* FROM SANPHAM
DECLARE @RT INT
EXEC @RT = TANG_GIA_SP_DOITAC_DL 'TK7','SP01',1000
IF @RT = 0
	PRINT N'THAY ĐỔI THẤT BẠI'
ELSE
	PRINT N'THAY ĐỔI THÀNH CÔNG'
SELECT* FROM SANPHAM