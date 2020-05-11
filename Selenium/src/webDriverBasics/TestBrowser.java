package webDriverBasics;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {

	public static void main(String[] args) 
	{
		//Firefox driver
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://way2automation.com");
        System.out.println("Successful lunching of FF");
		
		
		/*Chrome Driver
		 System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://way2automation.com");
		 System.out.println("Successful lunching of Chrome");*/
		 
		 /*IE driver
		 System.setProperty("webdriver.ie.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		 InternetExplorerDriver driver = new InternetExplorerDriver();
		 driver.get("https://way2automation.com");
		 System.out.println("Successful lunching of IE");*/
        
         String title= driver.getTitle();
         System.out.println(title);
         System.out.println("Length of title: "+ title.length());
         
         driver.close();
       //  driver.quit();
		 
	}

}
