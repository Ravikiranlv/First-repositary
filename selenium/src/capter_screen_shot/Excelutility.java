package capter_screen_shot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author ravik
 *
 */
public class Excelutility {
	public static String[][] readMultipleDataFromExcel(String excelpath, String sheetName) {
		Workbook workbook = null;
		FileInputStream fis;
		try {
			fis = new FileInputStream(excelpath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// FileInputStream fis = new FileInputStream(excelpath);
		// Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = (int) sheet.getPhysicalNumberOfRows();
		double colCount = (double) sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] sarr = new String[rowCount][(int) colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				sarr[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return sarr;
	}
}
