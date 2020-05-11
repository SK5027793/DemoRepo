package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropableElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    WebElement source= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement destination= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions action = new Actions(driver);
	    action.dragAndDrop(source, destination).perform();
	    
	    //action.dragAndDropBy(source, 400, 400).perform();
	}

}
