package readDataFromExcelandPassToTestCase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String[][] readMultipleDataFromExcel(String excelpath, String sheetName)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
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
