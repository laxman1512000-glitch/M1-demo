package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath = "//a[contains(text(),'organization Name')]/../..following-sibling::tr/td/a")
	private WebElement organizationName;
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
		
	public WebElement getOrganizationName() {
		return organizationName;
	}


	public void clickOnOrganizationName()
	{
		getOrganizationName().click();
	}
}

