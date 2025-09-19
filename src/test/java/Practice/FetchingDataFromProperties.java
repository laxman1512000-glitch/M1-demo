package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.PropertiesUtility;

public class FetchingDataFromProperties {

	public static void main(String[] args) throws IOException {
          ChromeDriver driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.manage().window().maximize();
       //   FileInputStream fis=new FileInputStream("C:\\Users\\laxma\\OneDrive\\Desktop\\Testdata.Properties");
      //	  Properties prop=new Properties();
      	//  prop.load(fis);
     // 	  String value= prop.getProperty("url");
     //     driver.get(value);
          
          
          
          PropertiesUtility obj = new PropertiesUtility();
         String URL = obj.getDataFromProperties("url");
         String name=obj.getDataFromProperties("username");
         String pass=obj.getDataFromProperties("password");
         System.out.println(name);
         System.out.println(pass);
         // FileInputStream fis=new FileInputStream("‪C:\\Users\\laxma\\OneDrive\\Desktop\\Testdata.Properties");
         // Properties prop=new Properties();
        //  prop.load(fis);
         // String value=prop.getProperty("url");
          
          driver.get(URL);
          
          
          
          //PropertiesUtility putil=new PropertiesUtility();
         // String URL=putil.getDataFromProperties("url");
          
	}

}
