package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creatingNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatingNewContactIcon() {
		return creatingNewContactIcon;
	}
	
	/**
	 * This is a business library to click on creating new contact icon
	 */
	
	public void ClickOnCreatingNewContactIcon()
	{
		getCreatingNewContactIcon().click();
	}

}
