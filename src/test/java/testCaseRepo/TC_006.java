package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;

public class TC_006 extends BaseClass {
@Test	(groups= {"regression"})
public void CON_003() throws EncryptedDocumentException, IOException
{
	HomePage hp=new HomePage(driver);
	hp.clickoncontacts();
	ContactsPage cp=new ContactsPage(driver);
	cp.ClickOnCreatingNewContactIcon();
	CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
	String lastName=eUtil.getDataFromExcelFile("Contacts", 7, 1);
	String departname=eUtil.getDataFromExcelFile("Contacts", 7, 2);
	String mobile=eUtil.getDataFromExcelFile("Contacts", 7, 3);
	String email=eUtil.getDataFromExcelFile("Contacts", 7, 4);
	String mailingCity=eUtil.getDataFromExcelFile("Contacts", 7, 5);
	String mailingCountry=eUtil.getDataFromExcelFile("Contacts", 7, 6);
	String mailingState=eUtil.getDataFromExcelFile("Contacts", 7, 7);
	cncp.createNewContacts(lastName, departname, email, mobile, mailingCity, mailingCountry, mailingState);

			
	
}
}
