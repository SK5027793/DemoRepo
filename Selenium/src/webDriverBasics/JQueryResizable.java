package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryResizable
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    WebElement resize =driver.findElement(By.xpath("/html/body/div/div[3]"));
    int width = resize.getSize().width;
    int height =resize.getSize().height;
    System.out.println(width);
    System.out.println(height);
    Actions action = new Actions(driver);
    action.dragAndDropBy(resize, 400, 400).perform();
	}
    
}
