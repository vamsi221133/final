package vamsi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimeCard {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = null ;
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://connect.maveric-systems.com/index.php/site/login");
		SubTimeCard STC = new SubTimeCard();
	
		STC.username(driver).sendKeys("vamsikrishnaa");
		STC.password(driver).sendKeys("Maveric123$");
		driver.findElement(By.name("yt0")).click();
		Thread.sleep(2000);
		STC.timecard(driver);
		STC.logout(driver);
	}

}
