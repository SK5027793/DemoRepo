package webDriverBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTabsAndPopus {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrerequisite\\DriversExecutables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        System.out.println("Generating winids from fst window");
        Set <String> winids= driver.getWindowHandles();
        Iterator<String> itr = winids.iterator();
        		
        String fst_win =  itr.next();
        System.out.println(fst_win);
        
        driver.findElement(By.id("loginsubmit")).click();

        //2nd window
        
        driver.switchTo().window("");
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"customertab1\"]/div[1]/div[2]/p[5]/strong/a")).click();
        
        
        //3rd window
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().contains("HDFC Bank |"));;
	}

}
