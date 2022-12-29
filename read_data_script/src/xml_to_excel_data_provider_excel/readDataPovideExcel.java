package xml_to_excel_data_provider_excel;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
public class readDataPovideExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/Book1.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);

		String data = workbook.getSheet("Organisation").getRow(13).getCell(12).getStringCellValue();
		System.out.println(data);

		String data1 = workbook.getSheet("Sheet1").getRow(10).getCell(6).getStringCellValue();
		System.out.println(data1);
		
		double data2 = workbook.getSheet("Sheet1").getRow(14).getCell(10).getNumericCellValue();
		System.out.println(data2);
		
		Date data3 =workbook.getSheet("Organisation").getRow(23).getCell(1).getDateCellValue();
		System.out.println(data3);
		
		Date data4 = workbook.getSheet("Sheet1").getRow(21).getCell(15).getDateCellValue();
		System.out.println(data4);
	 	
		boolean data5= workbook.getSheet("Organisation").getRow(6).getCell(5).getBooleanCellValue();
		System.out.println(data5);
		
		String data6 = workbook.getSheet("Sheet1").getRow(25).getCell(8).getStringCellValue();
		System.out.println(data6);
		
		 Hyperlink data7 = workbook.getSheet("Organisation").getRow(19).getCell(8).getHyperlink();
		System.out.println(data7);
		
		int data8 = workbook.getSheet("Sheet1").getRow(17).getCell(8).getColumnIndex();
		System.out.println(data8);
	}

}
