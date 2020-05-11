package WebDriverRevision;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
	   driver.get("http://popuptest.com/goodpopups.html");
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	   driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	   Thread.sleep(2000);
	   
	   Set <String> handler= driver.getWindowHandles();
       Iterator <String> it = handler.iterator();
     
       String parentId = it.next();//parent window Id
       System.out.println("Parent Id: "+parentId);
       
       String childId =it.next(); //Child window Id
       System.out.println("Child Id: "+childId);
       
       driver.switchTo().window(childId);
       Thread.sleep(2000);
       System.out.println("Title of child window: "+driver.getTitle());
       System.out.println("URL of child window: "+ driver.getCurrentUrl());
       driver.close();
       Thread.sleep(2000);
       
       driver.switchTo().window(parentId);
       System.out.println("Title of parent window: "+ driver.getTitle());
       driver.quit();
	}

	

}
