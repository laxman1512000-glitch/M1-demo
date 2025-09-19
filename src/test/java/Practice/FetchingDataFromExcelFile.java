package Practice;

import java.io.IOException;

/**
 * 
 */

import GenericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws Exception {

		ExcelUtility eutil=new ExcelUtility();
		String value=eutil.getDataFromExcelFile("Leads", 1, 3);
	System.out.println(value);
		
			}

}
