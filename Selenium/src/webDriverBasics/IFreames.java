package webDriverBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFreames {
    
	public static WebDriver driver;
	public static void CaptureScreenshot() throws IOException
	{
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//screenshot//maninpage.jpg"));
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        //driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_get");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        List<WebElement> frames= driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        
        for(WebElement frame: frames)
        {
        	System.out.println(frame.getAttribute("id"));
        }
        
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//*[@id=\"myBtn\"]")).click();
        
        /*File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//screenshot//maninpage.jpg"));*/
        
        CaptureScreenshot();
        
        driver.switchTo().defaultContent();
        
        
       
	}

}
