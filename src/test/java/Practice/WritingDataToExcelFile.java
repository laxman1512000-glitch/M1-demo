package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericUtility.ExcelUtility;

public class WritingDataToExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis= new FileInputStream("C:\\Users\\laxma\\OneDrive\\Desktop\\TestdataExcel.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh=wb.createSheet("Bike");
//		Row r=sh.createRow(3);
//		Cell cell=r.createCell(4);
//		cell.setCellValue("Royal enfield");
//		FileOutputStream fos=new FileOutputStream("C:\\Users\\laxma\\OneDrive\\Desktop\\TestdataExcel.xlsx");
//		wb.write(fos);
		
		ExcelUtility eutil=new ExcelUtility();
		eutil.WritringDataToExcelFile("Bike", 1, 1, "Pulsar220");
		

	}

}
