﻿--TRAN 1
USE QLDonHang
DECLARE @RT INT
EXEC @RT = SUA_GIA_DOITAC_FIX 'TK0003','SP08',10000
IF @RT = 0
	PRINT N'SỬA GIÁ THẤT BẠI'
ELSE
	PRINT N'SỬA GIÁ THÀNH CÔNG'
SELECT* FROM SANPHAM