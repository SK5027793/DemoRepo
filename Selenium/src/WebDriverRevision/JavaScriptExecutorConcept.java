package WebDriverRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

	
	   public static void  highlight( WebElement textbox,  WebDriver driver)
       {
    	    JavascriptExecutor js = ((JavascriptExecutor) driver);
        	String bgcolor = textbox.getCssValue("backgroundColor");
            	for(int i=0; i<100; i++)
            		{
            		changeColor("rgb(0,200,200,0)",textbox,driver);
            		changeColor(bgcolor, textbox, driver);
            		}
    	}
       
       public static void changeColor(String color, WebElement textbox, WebDriver driver)
       
       {
    	   JavascriptExecutor js = ((JavascriptExecutor) driver);
    	   js.executeScript("argument[0].style.backgroundColor= '"+color+"'", textbox);
    	   
    	   try 
    	   {
    		   Thread.sleep(20);
    		   
    	   }catch(InterruptedException e)
    	   {}
    	   
       }

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       driver.get("https://www.google.com");
       System.out.println(driver.getTitle());
       WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
       highlight(textbox, driver);  
	}
       
    }
