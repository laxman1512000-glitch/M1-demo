package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.DateFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericUtility.IpathUtility;

public class FetchingMultipleDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\laxma\\OneDrive\\Desktop\\TestdataExcel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Animal");
		//System.out.println(sh.getLastRowNum());
		DateFormatter df=new DateFormatter();
		for(int i=0; i<=sh.getLastRowNum();i++)
				
				{
			
				}
		
		

	}
	

}
