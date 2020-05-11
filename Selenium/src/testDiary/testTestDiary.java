package testDiary;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testTestDiary {
	public static WebDriver driver;
	
	public static void captureScareenshot() throws IOException
	{
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("path.jpg"));
	}
	
	
	public static void main(String[] args) throws IOException
	{	
	    
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	   driver = new FirefoxDriver();
       driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       String title = driver.getTitle();
       System.out.println(title);
       
       boolean flag = driver.findElement(By.name("restapi")).isSelected();
       if(flag==true)
       {
    	   System.out.println("Rest Api checkbox is selected");
       }
       else
       {
    	   System.out.println("Rest Api checkbox is not selected");
       }
       
       WebElement saveButton = driver.findElement(By.id("demo"));
       
       boolean savebuttondisplayed = saveButton.isDisplayed();
       if (savebuttondisplayed == true)
       {
    	   System.out.println("Save button is displayed");
       }
       else
       {
    	   System.out.println("Save button is not displayed");
       }
       
       boolean savebuttonenabled = saveButton.isEnabled();
       if (savebuttonenabled == true)
       {
    	   System.out.println("Save button is enabled");
       }
       else
       {
    	   System.out.println("Save button is disabled");
       }
       
       driver.findElement(By.id("php1")).click();
       
       boolean savebuttonenabledcheck = saveButton.isEnabled();
       if (savebuttonenabledcheck == true)
       {
    	   System.out.println("Save button is enabled");
       }
       else
       {
    	   System.out.println("Save button is disabled");
       }
       
       new Select(driver.findElement(By.id("Shirts"))).selectByVisibleText("Red Shirt");
       new Select(driver.findElement(By.id("Skirts"))).selectByValue("RedSkirt");
       
       WebElement table = driver.findElement(By.id("testtable"));
       List <WebElement> tr = table.findElements(By.tagName("tr"));
       int rowsize = tr.size();
       
       List <WebElement> td = table.findElements(By.tagName("td"));
       int colsize = td.size();
       
       System.out.println(rowsize+"   "+colsize);
       
       if(td.get(1).getText().equals("James"))
       {
    	   System.out.println("Pass");
       }
       
       WebElement testframe= driver.findElement(By.name("testframe"));
       driver.switchTo().frame(testframe);
       
       String expectedtext = driver.findElement(By.id("testpagelink")).getText();
       if(expectedtext.equals("My frame text"))
       {
    	   System.out.println("Frame pass");
       }
       
       int ylocation = driver.findElement(By.linkText("Open page in the same window")).getLocation().getY();
       
       int xlocation = driver.findElement(By.linkText("Open page in the same window")).getLocation().getX();
       
       JavascriptExecutor jsp = (JavascriptExecutor) driver;
       jsp.executeScript("window.scrollBy(" + xlocation + "," + ylocation + ")", "");

       driver.findElement(By.linkText("Open page in the same window")).click();
       
       captureScareenshot();
       
       
	}
   /*    driver.switchTo().alert().accept();
       driver.switchTo().alert().dismiss();
       
       Alert alert = driver.switchTo().alert();
       System.out.println(alert.getText());
	}
	public boolean alertcheck()
    {
 	   try
 	   {
 		   driver.switchTo().alert();
 		   return true;
 	   }
 	   catch(Exception e)
 	   {
 		   return false;
 	   }
    }*/
	
	
}
