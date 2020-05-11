package WebDriverRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException
	{   
        System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        String text = "Please enter a valid user name";
        if(text.equals(alert.getText()))
        {
        	System.out.println("Correct alert message is displayed");
        }
        else
        {
        	System.out.println("Incorrect alert message is displayed");

        }
        alert.accept();
        System.out.println("Accepted alert");
        driver.close();
        
	}

}
