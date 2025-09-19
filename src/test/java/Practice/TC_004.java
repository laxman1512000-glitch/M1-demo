package Practice;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;

public class TC_004 extends BaseClass{
	
	@Test
	public void CON_001() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickoncontacts();
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickOnCreatingNewContactIcon();
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		String firstName=eUtil.getDataFromExcelFile("Contacts", 1, 1);
		String lastName=eUtil.getDataFromExcelFile("Contacts", 1, 2);
		cncp.createNewContact(driver, firstName, lastName);
		
		
	}
	
	

}
