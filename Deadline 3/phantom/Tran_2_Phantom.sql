﻿--TRAN 2
DECLARE @RT13_2 INT 
EXEC @RT13_2 = USP_CAU13_QTV 'TK00006'
IF @RT13_2 = 1
	PRINT N'XÓA TÀI KHOẢN THÀNH CÔNG'
ELSE
	PRINT N'XÓA TÀI KHOẢN KHÔNG THÀNH CÔNG'	