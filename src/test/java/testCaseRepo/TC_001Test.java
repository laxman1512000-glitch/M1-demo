package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import GenericUtility.BaseClass;
import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
@Listeners(GenericUtility.ListenerImplementationClass.class)

public class TC_001Test extends BaseClass {
	@Test (groups= {"smoke","sanity"} )
	public void LE_001() throws EncryptedDocumentException, IOException
	{
	HomePage hp=new HomePage(driver);
	hp.clickonLeads();
	LeadsPage lp=new LeadsPage(driver);
	lp.ClickOnCreateNewLeadIcon();
	String firstName=eUtil.getDataFromExcelFile("Leads", 1, 1);
	String lastName=eUtil.getDataFromExcelFile("Leads", 1, 2);
	String company=eUtil.getDataFromExcelFile("Leads", 1, 3);
	CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
	cnlp.createNewLead(firstName, lastName, company);

	
	}
	@Test
	public void demo()
	{
		System.out.println("demo excuted");
		String UN=System.getProperty("username");
		System.out.println(UN);
		String PWD=System.getProperty("password");
		System.out.println(PWD);
	}
	
	

}


