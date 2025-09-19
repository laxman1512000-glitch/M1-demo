package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;

public class TC_005 extends BaseClass{
	@Test (groups= {"regression"})
public void CON_002() throws EncryptedDocumentException, IOException
{
	HomePage hp=new HomePage(driver);
	hp.clickoncontacts();
	ContactsPage cp=new ContactsPage(driver);
	cp.ClickOnCreatingNewContactIcon();
	String lastName=eUtil.getDataFromExcelFile("Contacts", 4,1);
	String title=eUtil.getDataFromExcelFile("Contacts", 4,2);
	String department=eUtil.getDataFromExcelFile("Contacts", 4,3);
	String email=eUtil.getDataFromExcelFile("Contacts", 4,4);
	String mobile=eUtil.getDataFromExcelFile("Contacts", 4,5);
	CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
	cncp.createNewContacts(lastName, title, department, email, mobile);
	
}
}
