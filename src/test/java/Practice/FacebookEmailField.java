package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookEmailField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
		ele.sendKeys("laxman@gmail.com");
		driver.navigate().refresh();
		
       ele.sendKeys("lakshmanan15200@gmail.com");
	}

}
