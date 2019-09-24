package vamsi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushAlert()']"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushConfirm()']")).click();;
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println("msg is "+text);
		alert.dismiss();
		
		driver.findElement(By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; promptConfirm()']")).click();
		Thread.sleep(2000);
		//Alert alert1 = driver.switchTo().alert().sendKeys("no");
		String text1 = alert.getText();
		System.out.println("msg is "+text1);
		alert.sendKeys("no");
		alert.accept();
		
	}

}
