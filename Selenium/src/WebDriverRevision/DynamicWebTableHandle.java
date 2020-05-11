package WebDriverRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandle
{

	public static void main(String[] args)
	{
      System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      
      driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
      
      
      //Method-1
      String before_xpath="//*[@id=\"task-table\"]/tbody/tr[";
      String after_xpath="]/td[2]";
      
      for(int i=1; i<=7; i++)
      {
          String cellValue = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	      System.out.println(cellValue);
	      if(cellValue.equals("Browser Issues"))
	      {
	    	  System.out.println("Browser Issues is present in given table");
	    	  String status = driver.findElement(By.xpath(before_xpath+i+"]/td[4]")).getText();
	    	  System.out.println("Status is "+status);
	      }
      }
	}

}
