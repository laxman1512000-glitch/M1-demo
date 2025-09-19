package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	public String getDataFromProperties(String key) throws IOException ,FileNotFoundException{
	FileInputStream fis=new FileInputStream(IpathUtility.propetiesfile);
	Properties prop=new Properties();
	prop.load(fis);
	String value= prop.getProperty(key);
	return value;
	

}
}