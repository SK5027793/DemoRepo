package webDriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebTables
{   
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    List<WebElement> rows= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
	    System.out.println("Total rows: "+rows.size());
	    
	    List<WebElement> clms= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
	    System.out.println("Total columns: "+clms.size());

	    for (int row =1; row<= rows.size(); row++)
	    {
	    	{
	    		for (int clm=1; clm<= clms.size(); clm++)
	    		{
	    			System.out.print(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+row+"]/td["+clm+"]")).getText());
	    			System.out.print("\t");
	    		}
	    		System.out.println();
	    	}
	    }
}
}