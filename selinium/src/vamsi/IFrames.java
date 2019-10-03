

package vamsi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//span[contains(text(),'Software Testing Tutorial')]")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().;
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"presscore-custom-menu-two-2\"]/ul/li[1]/a/span")).click();
		//driver.switchTo().parentFrame();
		//driver.findElement(By.linkText("HOME")).click();
		
	
	}

}
