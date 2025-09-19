package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	@Test (groups= {"smoke","regression"} )
	public void LE_003() throws Exception, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadsPage lp=new LeadsPage(driver);
		lp.ClickOnCreateNewLeadIcon();
		CreatingNewLeadPage cp=new CreatingNewLeadPage(driver);
		String lastName=eUtil.getDataFromExcelFile("Leads",7,1);
		String company=eUtil.getDataFromExcelFile("Leads",7,2);
		String title=eUtil.getDataFromExcelFile("Leads",7,3);
		String email=eUtil.getDataFromExcelFile("Leads",7,4);
		String country=eUtil.getDataFromExcelFile("Leads",7,5);
		String city=eUtil.getDataFromExcelFile("Leads",7,6);
		String state=eUtil.getDataFromExcelFile("Leads",7,7);
		cp.creatNewLead(lastName, company, title, email, country, city, state);


	}

}
