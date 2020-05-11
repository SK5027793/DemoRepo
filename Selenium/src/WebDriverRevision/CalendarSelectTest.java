package WebDriverRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://jqueryui.com/datepicker/");
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total number of frames present on page "+size);
        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        
        
        String date = "25/09/1993";
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(date);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(Keys.ESCAPE);
        
        
       
       /* String dateArray[]= date.split("-");
        
        String day =dateArray[0];
        String month = dateArray[1];
        String year = dateArray[2];
        
       driver.findElement(By.className("ui-datepicker-month")).sendKeys(month);
       driver.findElement(By.className("ui-datepicker-year")).sendKeys(year);*/
       
        
        
        
        
	}

}
