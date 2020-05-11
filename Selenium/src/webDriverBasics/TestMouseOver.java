package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMouseOver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"))).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3")).click();
        WebElement menu= driver.findElement(By.xpath("/html/body/div[4]/div/header/div[3]/div/nav/div[2]/ul/li[8]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        
        driver.findElement(By.linkText("Practice site 1")).click();
	    
	}

}
