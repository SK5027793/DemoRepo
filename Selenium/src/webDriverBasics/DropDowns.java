package webDriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        //driver.findElement(By.name("country")).sendKeys("Germany");
        //driver.findElement(By.id("searchLanguage")).sendKeys("Dansk");
        WebElement dropdown = driver.findElement(By.id("searchLanguage"));
        Select select = new Select(dropdown);
        //select.selectByVisibleText("Eesti");
        //select.selectByValue("hi");
        select.selectByIndex(7);
        
        List<WebElement> values =driver.findElements(By.tagName("Option"));
        System.out.println("Total values are: "+values.size());
        System.out.println(values.get(5).getText());
        
        for (int i=0; i<values.size(); i++)
        {
        	System.out.println(values.get(i).getAttribute("lang"));
        	
        }
       
       WebElement block = driver.findElement(By.xpath("//*[@id=\'www-wikipedia-org\']/div[6]/div[3]"));
       List<WebElement> links= block.findElements(By.tagName("a"));
       System.out.println("Total links present on page: "+links.size());
       
      /* for (int i=0; i< (links.size()); i++)
       {
    	   System.out.println(links.get(i).getText());
       }*/
       
       for(WebElement link:links)
       {
    	   System.out.println(link.getText());
       }
	}
}
