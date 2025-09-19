package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration of webelements
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement usernmaeTextField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement loginButton;
	
	// Initialization of webelements
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//public getters
	
	
	public WebElement getUsernmaeTextField() {
		return usernmaeTextField;
	}



	public WebElement getPasswordTextField() {
		return passwordTextField;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}

	//Utilization of WebElements


	public void loginToApplication(String UN, String PWD)
	{
		getUsernmaeTextField().sendKeys(UN);
		getPasswordTextField().sendKeys(PWD);
		getLoginButton().click();;
	}

}
