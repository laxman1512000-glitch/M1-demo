package GenericUtility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	public WebDriver driver;
	
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("DataBase connected");
	}
	
	@BeforeClass
	public void launchBrowser() throws FileNotFoundException, IOException
	{
		driver=new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitwait(driver, 15);
		String URL=pUtil.getDataFromProperties("url");
		sUtil.getApplication(driver, URL);
		System.out.println("Browser launched sucessfuly");
	}
	
	@BeforeMethod
	public void loginOperation() throws FileNotFoundException, IOException
		{
		LoginPage lp=new LoginPage(driver);
		String UN=pUtil.getDataFromProperties("username");
		String PWD=pUtil.getDataFromProperties("password");
		lp.loginToApplication(UN, PWD);
        System.out.println("login done sucessfuly");
		
	}
	
	@AfterMethod
	public void logoutOperation()
		{
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("logout done sucessfuly");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed succesfuly");
	}
	
	@AfterSuite
	public void closeDBConnection()
	{
		System.out.println("DB connection closed");
	}

}
