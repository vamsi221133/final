package practicle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Fastrac {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver(options);
		driver.get("https://www.fastrack.in/");
		
		driver.switchTo().frame("__ta_notif_frame_0");
		driver.findElement(By.xpath("//div[@class='close']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().frame("yie-js");
		//driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='close-icon'])[1]")).click();
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		WebElement ele =   driver.findElement(By.xpath("(//a[@class='hidden-xs hidden-sm sublevel'])[4]"));
		act.moveToElement(ele);
		Thread.sleep(2000);
		WebElement bag  =   driver.findElement(By.xpath("//*[@id=\"guys\"]/div/div/div/div/div[1]/div/div/ul[1]/li[4]/a"));
		act.moveToElement(bag);
		Thread.sleep(2000);
		act.click().build().perform();
	}

}
