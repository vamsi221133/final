package vamsi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("login");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		
		System.out.println("entering user id");
		driver.findElement(( By.name("email"))).sendKeys("6281186742");
		driver.findElement(( By.className("a-button-input"))).click();
		Thread.sleep(3000);
		
		System.out.println("entering user password");
		driver.findElement(( By.name("password"))).sendKeys("vmskrshn10");
		Thread.sleep(200);
		System.out.println("signing in ");
		driver.findElement(( By.xpath("//*[@id=\"signInSubmit\"]"))).click();
		
		System.out.println("searching ");
		driver.findElement( By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("hai '-' ");
		driver.findElement(By.className("nav-input")).click();
		
		System.out.println("sorting");
		Thread.sleep(800);
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]")).click();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		
	//automatic dropdown
		Thread.sleep(800);
		WebElement orders = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]/span"));
		Actions action=new Actions(driver);
		action.moveToElement(orders).build().perform();
		System.out.println("view orders");
		driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
		Thread.sleep(6000);
		
		System.out.println("view wishlist");
		WebElement wishlist = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]/span"));
		Actions action1=new Actions(driver);
		action1.moveToElement(wishlist).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span")).click();
		Thread.sleep(6000);
		
		System.out.println("signout");
		WebElement signout = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]/span"));
		Actions action2=new Actions(driver);
		action2.moveToElement(signout).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
	
	}
}
