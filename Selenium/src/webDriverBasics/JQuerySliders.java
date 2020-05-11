package webDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerySliders {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    WebElement mainslider = driver.findElement(By.id("slider"));
	    int width = (mainslider.getSize().width)/2;

	    WebElement slider = driver.findElement(By.xpath("/html/body/div/span"));
	    
	    Actions action = new Actions(driver);
	    action.dragAndDropBy(slider, width, 0).perform();
	}

}
