package vamsi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get ("https://www.flipkart.com/");
		//driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("9182886890");
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@type='password']")).sendKeys("9182886890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
		//System.out.println(recive.getClass());
		//Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		//System.out.println("msg is "+text);
		//alert.dismiss();
		
		
	/*	driver.findElement(By.xpath("/html/body/div[2]/div")).isDisplayed();
		Thread.sleep(2000);
	
		driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		//alert.dismiss(); */
		
	
		
		
		
	
	}

}
