package WebDriverRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException
	{
      // System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
      // WebDriver driver = new FirefoxDriver();
       WebDriver driver = new HtmlUnitDriver();
       
       driver.get("http://popuptest.com/goodpopups.html");
       Thread.sleep(2000);
       System.out.println(driver.getTitle());
       driver.close();
       
	}

}
