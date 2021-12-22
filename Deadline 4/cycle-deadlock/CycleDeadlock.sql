﻿USE QLDonHang
GO
CREATE OR ALTER
PROC XOA_CHI_NHANH_TRAN1
	@MACHINHANH CHAR(3),
    @MADT CHAR(10)
AS
SET TRAN ISOLATION LEVEL REPEATABLE READ
BEGIN TRAN
	BEGIN TRY
		IF NOT EXISTS (SELECT * FROM CHINHANH WHERE MACN = @MACHINHANH AND MADT = @MADT)
		BEGIN
			   PRINT N'CHI NHÁNH NÀY KHÔNG TỒN TẠI'
			   ROLLBACK TRAN
			   RETURN
		END

		UPDATE HOPDONG
		SET SOCHINHANH = SOCHINHANH - 1
		WHERE MAHD = (SELECT MAHD FROM CHINHANH WHERE MACN = @MACHINHANH AND MADT = @MADT)
		WAITFOR DELAY '00:00:10'

		DELETE CHINHANH
		WHERE MACN = @MACHINHANH AND MADT = @MADT
	END TRY
	BEGIN CATCH
		--PRINT N'LỖI HỆ THỐNG'
		--ROLLBACK TRAN
		--RETURN
		DECLARE @ErrorMsg VARCHAR(2000)
		SELECT @ErrorMsg = N'Lỗi: ' + ERROR_MESSAGE()
		RAISERROR(@ErrorMsg, 16,1)
		ROLLBACK TRAN
		RETURN
	END CATCH
COMMIT TRAN
GO
CREATE OR ALTER 
PROC XOA_CHI_NHANH_TRAN2
	@MACHINHANH CHAR(3),
    @MADT CHAR(10)
AS
SET TRAN ISOLATION LEVEL REPEATABLE READ
BEGIN TRAN
	BEGIN TRY
		IF NOT EXISTS (SELECT * FROM CHINHANH WHERE MACN = @MACHINHANH AND MADT = @MADT)
		BEGIN
			   PRINT N'CHI NHÁNH NÀY KHÔNG TỒN TẠI'
			   ROLLBACK TRAN
			   RETURN
		END

		DECLARE @MAHD AS CHAR(10)
		SET @MAHD = (SELECT MAHD FROM CHINHANH WHERE @MACHINHANH = MACN AND MADT = @MADT)

		DELETE CHINHANH
		WHERE MACN = @MACHINHANH AND @MADT = MADT

		UPDATE HOPDONG
		SET SOCHINHANH = SOCHINHANH - 1
		WHERE MAHD = @MAHD

	END TRY
	BEGIN CATCH
		--PRINT N'LỖI HỆ THỐNG'
		--ROLLBACK TRAN
		--RETURN
		DECLARE @ErrorMsg VARCHAR(2000)
		SELECT @ErrorMsg = N'Lỗi: ' + ERROR_MESSAGE()
		RAISERROR(@ErrorMsg, 16,1)
		ROLLBACK TRAN
		RETURN
	END CATCH
COMMIT TRAN