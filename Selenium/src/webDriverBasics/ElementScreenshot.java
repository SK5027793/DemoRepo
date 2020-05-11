package webDriverBasics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementScreenshot {
	public static WebDriver driver;
    public static void captureElementScreenshot(WebElement ele) throws IOException
    {
    	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);
        Point point = ele.getLocation();
        
        int width= ele.getSize().width;
        int height =ele.getSize().height;
        
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), width, height);
        ImageIO.write(eleScreenshot, "jpg", screenshot);
        
        File screenshotLocation = new File(".\\screenshot\\error.jpg");
        FileUtils.copyFile(screenshot, screenshotLocation);
    }
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        WebElement ele= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        captureElementScreenshot(ele);
		
	}

}
