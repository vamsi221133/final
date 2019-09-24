package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

		static WebDriver driver;
		@BeforeTest
		public static void launch(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://connect.maveric-systems.com/index.php/site/login");
			System.out.println("before test");
		}
		
		
		@Test
		@Parameters({"sUsername","sPassword"})
		public void login(String sUsername,String sPassword) throws InterruptedException {
			driver.findElement(By.xpath("//input[@name=\"LoginForm[username]\"]")).sendKeys(sUsername);
			driver.findElement(By.xpath("//input[@name=\"LoginForm[password]\"]")).sendKeys(sPassword);
			Thread.sleep(2000);
		}	
		
		@AfterTest
		public void close() {

			driver.quit();

		}

}
