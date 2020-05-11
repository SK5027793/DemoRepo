package WebDriverRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("https://html.com/input-type-file/");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sudhir\\Desktop\\Amdocs.doc");
       System.out.println("File uploaded successfuly");
     
	}

}
