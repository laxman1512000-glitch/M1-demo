package testCaseRepo;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
@Listeners(GenericUtility.ListenerImplementationClass.class)
public class TC_002 extends BaseClass{
	
	@Test (groups= {"sanity"} )
	public void LE_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		Assert.fail();
		LeadsPage lp=new LeadsPage(driver);
		lp.ClickOnCreateNewLeadIcon();
		String lastName=eUtil.getDataFromExcelFile("Leads", 4, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 4, 2);
		String leadSource=eUtil.getDataFromExcelFile("Leads", 4, 3);
		String noOfEmp=eUtil.getDataFromExcelFile("Leads", 4, 4);
		String mobile=eUtil.getDataFromExcelFile("Leads", 4,5);
		CreatingNewLeadPage cp=new CreatingNewLeadPage(driver);
		cp.createNewLead(lastName, company, leadSource, noOfEmp, mobile);


		
	}

}
