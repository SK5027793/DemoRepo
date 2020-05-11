package webDriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckboxes {
	 public static WebDriver driver;
	 public static boolean isElementPresent(By by) 
	 {   
	 	int size = driver.findElements(by).size();
	 	if (size==0)
	 	{
	 		return false;
	 	}else {
	 		return true;
	 	}

	 }
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    //driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	  /*  driver.findElement(By.xpath("//div[4]/input[1]")).click();
	    
	    driver.findElement(By.xpath("//div[4]/input[2]")).click();
	    
	    driver.findElement(By.xpath("//div[4]/input[3]")).click();

	    driver.findElement(By.xpath("//div[4]/input[4]")).click();*/


	   /* for (int i=1; i<=4; i++)
	    {
		    driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();

	    }*/
	    
	    /*int i=1;
	    int count=0;
	    while(isElementPresent(By.xpath("//div[4]/input["+i+"]"))) 
	    {
	    	driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
	    	i++;
	    	count++;
	    }
	    
	    System.out.println("Total checkboxes are: "+ count);
	    driver.close();*/
	    
	  /*click all the check boxes available on page
	    List<WebElement> checkboxes= driver.findElements(By.name("sports"));
	    System.out.println("Total checkboxes are: " + checkboxes.size());
	   
	   for(WebElement checkbox: checkboxes)
	   {   
    	   System.out.println(checkbox.getText());
    	   checkbox.click();
	   }
	   */
	    
	   WebElement block = driver.findElement(By.xpath("//td/div[4]"));
	   List<WebElement> bboxes= block.findElements(By.name("sports"));
	   
	   for (WebElement box : bboxes)
	   {
		   box.click();
	   }
	   
	}

}
