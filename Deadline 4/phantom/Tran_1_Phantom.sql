﻿USE QLDonHang
--TRAN 1
DECLARE @RT13_1 INT
EXEC @RT13_1 = USP_CAU13_DT 'TK0005','123','1'
IF @RT13_1 = 1
	PRINT N'MẬT KHẨU THAY ĐỔI THÀNH CÔNG'
ELSE
	PRINT N'MẬT KHẨU THAY ĐỔI KHÔNG THÀNH CÔNG'
