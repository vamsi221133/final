package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chumma {

	public static void main(String[] args) {
		WebDriver driver ;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
	 ele.sendKeys("vamsi");
	 ele.submit();
	 driver.findElement(By.partialLinkText("https://en.wikipedia.org › wiki › Vamsi_(film)")).click();
	 

	}

}
