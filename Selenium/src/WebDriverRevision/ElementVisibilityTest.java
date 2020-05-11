package WebDriverRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		boolean b1= driver.findElement(By.id("demo")).isDisplayed();
		System.out.println("Save button is displayed: "+b1);
		
		boolean b2= driver.findElement(By.id("demo")).isEnabled();
		System.out.println("Save button is enabled: "+b2);
		
		boolean b3=driver.findElement(By.id("java1")).isSelected();
		System.out.println("Java radio button is selected: "+b3);
		
		boolean b4= driver.findElement(By.id("restapibox")).isSelected();
		System.out.println("Rest option is selected: "+b4);
		
		//Select Java option and again check Save button is enabled
		driver.findElement(By.id("java1")).click();
		System.out.println("Java option is selected");
		
		
		
	}

}
