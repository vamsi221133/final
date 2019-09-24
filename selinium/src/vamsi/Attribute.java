package vamsi;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("yt0"));
		String tooltiptext = element.getAttribute("value");
		System.out.println("attribute is "+tooltiptext);
		Thread.sleep(2000);

	}

}
