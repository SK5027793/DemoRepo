package WebDriverRevision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException 
	{
      Properties prop = new Properties();
      FileInputStream ip = new FileInputStream("F:\\eclipse-workspace\\Selenium\\src\\WebDriverRevision\\config.properties");
      
      prop.load(ip);
      System.out.println(prop.getProperty("name"));
      System.out.println(prop.getProperty("Age"));
      System.out.println(prop.getProperty("environment"));
      System.out.println(prop.getProperty("URL"));
	}

}
