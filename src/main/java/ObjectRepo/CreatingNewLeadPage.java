package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import GenericUtility.SeleniumUtility;

public class CreatingNewLeadPage extends BaseClass{
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyNameTextField;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropDown;
	
	@FindBy(id = "noofemployees")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(id = "mobile")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
		public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyNameTextField;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewLead(String fName, String lName, String company)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	public void createNewLead(String lName, String company, String leadSource, String noOfEmployes, String mobile)
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		SeleniumUtility sUtil= new SeleniumUtility();
		sUtil.selectOptionByValue(getLeadSourceDropDown(), leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployes);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
		
	}
	public void creatNewLead(String lName, String company, String title, String email, String country, String city, String state)
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getCountryTextField().sendKeys(country);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
	}
	
	
	

}
