package practicle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.fastrack.in/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//driver.findElement(By.xpath("//a[@class='close-icon']")).click();
		/*Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		//driver.findElement(By.xpath("//span[@aria-label='close button']")).click();
		Actions act = new Actions(driver);
		WebElement ele =   driver.findElement(By.partialLinkText("Guys"));
		act.moveToElement(ele);
		Thread.sleep(2000);
		WebElement mytimecard  =   driver.findElement(By.partialLinkText("Bags"));
		act.moveToElement(mytimecard);
		Thread.sleep(2000);
		act.click().build().perform();
		*/
		Thread.sleep(2000);
		driver.switchTo().frame("__ta_notif_frame_0");
		driver.findElement(By.xpath("//div[@class='close']")).click();
		//driver.findElement(By.xpath("(//a[@class='close-icon'])[1]")).click();
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[@aria-label='close button']")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement ele =   driver.findElement(By.xpath("(//a[@class='hidden-xs hidden-sm sublevel'])[4]"));
		act.moveToElement(ele);
		Thread.sleep(2000);
		WebElement bag  =   driver.findElement(By.xpath("//a[@href='/shop/bags/gender=guys']"));
		act.moveToElement(bag);
		Thread.sleep(2000);
		act.click().build().perform();

	}

}
