package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/*
 * Selenium Utility
 * @author Laxman
 * @version 19.08.2025
 */

public class SeleniumUtility {
	
	/*
	 * Selenium Utility method to get the application
	 * @param driver
	 * @param url
	 */
	public void getApplication(WebDriver driver, String url) {
		driver.get(url);
	}
	
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/*
	 * This is a generic method to provid impilicity wait
	 * @paramdriver
	 * @param maxiTime
	 */
	public void implicitwait (WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/*This is a generic method to select an option in a dropdown by using its index
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using its value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element, String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);		
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using its visible text
	 * @param element
	 * @param visible
	 */
	public void selectOptionByvisible(WebElement element, String visible) {
		Select s=new Select(element);
		s.selectByVisibleText(visible);
	}
	
	/**
	 * This is generic method to accept an alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to cancel an alert
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This is generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click opertion
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element) {
		Actions a =new Actions(driver);
		a.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform drag and drop opertion
	 * @param driver
	 * @param element1
	 * @param element2
	 */
		public void dragAndDropOperation(WebDriver driver,WebElement element1, WebElement element2) {
		Actions a =new Actions(driver);
		a.dragAndDrop(element1, element2).perform();
	}
		
		/**
		 * This is a generic method to wait explicity for a webelemnt to visible
		 * @param driver
		 * @param maxTime
		 * @param locator
		 */
	public void waitForElementToBeVisible(WebDriver driver, int maxTime, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * This is generic method to perform window scrolling operation
	 * @param driver
	 * @param x
	 * @param y
	 */
	
	public void scrollingWindow(WebDriver driver, int x, int y) {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo("+x+","+y+");");
	}
			
	/**
	 * This is a generic method to switch
	 * @param driver
	 */
	
	public void switcToSecondWindow(WebDriver driver)
	{
		String parentId=driver.getWindowHandle();
		Set<String> allIDs=driver.getWindowHandles();
		for(String id: allIDs)
		{
			if(!id.equals(parentId))
				driver.switchTo().window(id);
		}
	}
		
		
	public String takeScreenShotofWebpage(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+screenshotName+".png");
	    Files.copy(src, dest);
	    return screenshotName;
		
	}
		

	

	}

