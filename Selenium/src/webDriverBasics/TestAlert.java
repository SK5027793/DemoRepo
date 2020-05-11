package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAlert {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/p/a[1]")).click();
	    driver.findElement(By.name("proceed")).click();
	    
	   /* Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();*/
	    
	    WebDriverWait wait = new WebDriverWait (driver, 10);
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    System.out.println(alert.getText());
	    alert.accept();
	    
	}

}
