package WebDriverRevision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpathGoogleSearch {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      driver.get("https://www.google.com/");
      String search ="java";
      driver.findElement(By.name("q")).sendKeys(search);
      
      List <WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
      System.out.println("For "+ search+ " total number of suggestions are "+list.size());
      
      for(int i=0; i<list.size(); i++)
      {
    	  System.out.println(list.get(i).getText());
    	  if(list.get(i).getText().contains("javascript tutorial"))
    	  {
    		  list.get(i).click();
    		  break;
    	  }
      }
	}

}
