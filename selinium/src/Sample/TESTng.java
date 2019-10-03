package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTng {
	
	static WebDriver driver ;
	
	@BeforeTest
	public static void confi() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Desktop\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public static void open() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		 ele.sendKeys("Outlook");
		 ele.submit();
		 driver.findElement(By.partialLinkText("outlook")).click();
		 driver.findElement(By.partialLinkText("Sign in")).click();
		 Thread.sleep(2000);
	}
	@Test(priority = 1)
	public static void login() throws InterruptedException {
		 WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		 Thread.sleep(2000);
		 ele.sendKeys("vamsikrishnaa@maveric-systems.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Maveric123$");
		 //ele1.sendKeys("Maveric123$");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.id("idBtn_Back")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public static void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='VA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign out")).click();
		
	}
}
