package vamsi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		/*WebDriverWait wait = new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("LoginForm_password")));
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Pom.username(driver).sendKeys("vamsikrishnaa");
		Thread.sleep(2000);
		Pom.password(driver).sendKeys("Maveric12#");
		driver.findElement(By.name("yt0")).click();*/
		
		Page fa = new Page(driver);
				Thread.sleep(2000);
				fa.password.sendKeys("vamsikrsih");
				Thread.sleep(2000);
				fa.username.sendKeys("safasd");
		driver.manage().window().maximize();
		
		/*Pom timesheet = new Pom(driver);
		timesheet.username.sendKeys("vamsikrishnaa");
		timesheet.password.sendKeys("Maveric12#");
		timesheet.login.click();
		Thread.sleep(2000);*/
		
		
	}

}
