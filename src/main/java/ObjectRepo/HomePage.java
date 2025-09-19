package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.SeleniumUtility;

public class HomePage {
	
	@FindBy(xpath = "//a[@href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountMenu;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutMenu;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountMenu() {
		return accountMenu;
	}
	
	public WebElement getSignOutMenu() {
		return signOutMenu;
	}
	
	
	public void clickonLeads()
	{
		getLeadsMenu().click();
	}
	public void clickoncontacts()
	{
		getContactsMenu().click();
	}
	public void signOutOperation(WebDriver driver) {
		SeleniumUtility sUtil=new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getAccountMenu());
		getSignOutMenu().click();
	}

}
