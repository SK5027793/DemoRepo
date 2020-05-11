package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresenceOfElement
{  public static WebDriver driver;


  /* public static boolean isElementPresent(String locator) 
   {   try {
	        driver.findElement(By.xpath(locator));
	 	   return true;
           }catch(Throwable t)
            { return false;}
   
   }*/

public static boolean isElementPresent(By by) 
{   
	int size = driver.findElements(by).size();
	if (size==0)
	{
		return false;
	}else {
		return true;
	}

}

   
   
   public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
    //driver.get("http://way2automation.com/way2auto_jquery/index.php");
	driver.get("https://www.wikipedia.org/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //System.out.println(driver.findElement(By.xpath("//*[@id=\'js-link-box-en\']/strong")).isDisplayed());
    System.out.println(isElementPresent(By.xpath("//*[@id=\'js-link-box-en\']/strong")));
}
}
