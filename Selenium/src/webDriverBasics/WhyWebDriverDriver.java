package webDriverBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WhyWebDriverDriver {
	public static String browser ="chrome";

	public static void main(String[] args) 
	{           
		
	      if (browser.equals("firefox"))
	      {
				System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		        FirefoxDriver driver = new FirefoxDriver();
		       
	      }else if(browser.equals("chrome"))	
				
				 {
	    	       System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
				   ChromeDriver driver = new ChromeDriver();
				  
				 }else if (browser.equals("ie"))
				          
		            	{
					 		System.setProperty("webdriver.ie.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
					 		InternetExplorerDriver driver = new InternetExplorerDriver();
	                    }
	}

}
