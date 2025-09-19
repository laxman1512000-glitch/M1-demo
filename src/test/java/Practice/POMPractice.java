package Practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import ObjectRepo.LeadsPage;
import ObjectRepo.LoginPage;

public class POMPractice {

	public static void main(String[] args) throws FileNotFoundException, IOException {
         PropertiesUtility pUtil=new PropertiesUtility();
         String URL=pUtil.getDataFromProperties("url");
         String UN=pUtil.getDataFromProperties("username");
         String PWD=pUtil.getDataFromProperties("password");
         SeleniumUtility sUtil=new SeleniumUtility();
         WebDriver driver=new ChromeDriver();
         sUtil.maximizeWindow(driver);
         sUtil.implicitwait(driver, 15);
         sUtil.getApplication(driver, URL);
         LoginPage lp=new LoginPage(driver);
         lp.loginToApplication(UN, PWD);
         LeadsPage lps=new LeadsPage(driver);
         lps.ClickOnCreateNewLeadIcon();
         
         
	}

}
