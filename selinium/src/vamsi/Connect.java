package vamsi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;


public class Connect {

	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://connect.maveric-systems.com/index.php/site/login");
			//List<WebElement> username = driver.findElements(By.tagName("input"));
			//System.out.println("list of elements are :"+username.size());
			
			//WebElement text = driver.findElement(By.xpath("//p[@text,'content']"));
			//System.out.println("the text is -->"+text.getText());
			//System.out.println(text.getClass());
			//driver.findElement(By.name("LoginForm[username]")).sendKeys("vamsikrishnaa");
			driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("vamsikrishnaa");
			driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("Maveric12#");
			driver.findElement(By.name("yt0")).click();
			//for logout
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			WebElement main = driver.findElement(By.xpath("(//*[@class='jqueryslidemenu']//*[@style='padding-right: 23px;'])[9]"));
					act.moveToElement(main);
			Thread.sleep(2000);
			WebElement sub = driver.findElement(By.xpath("//*[@href='/index.php/site/logout'] "));
			act.moveToElement(sub);
			Thread.sleep(2000);
			act.click().build().perform();
			
			//Thread.sleep(3000);
			//Actions actions = new Actions(driver);
			 
			//actions.moveToElement(driver.findElement(By.xpath("//*[@class=\"jqueryslidemenu\"]/ul/li[9]/a"))).build().perform();
			//driver.findElement(By.linkText("Add Timecard")).click();
			//driver.findElement(By.xpath("//*[@id=\"weekid\"]")).click();
			
			//WebElement check = driver.findElement(By.id("LoginForm_rememberMe"));
			//System.out.println(check.isSelected());
			//System.out.println(check.isEnabled());
			//System.out.println(check.isDisplayed());
			//WebElement text = driver.findElement(By.xpath("//*[@id=\"ltjqsm953\"]/ul/li[10]/a"));
			//String text1 = text.getText();
			//driver.findElement(By.xpath("//*[@id=\"weekid\"]")).click();
			 // Select text1 = new Select(driver.findElement(By.id("text")));
			//continents.selectByIndex("continents");
			//courses.selectByIndex("dashicons-video-alt3 mega-menu-link");
			//driver.findElements(By.("//*[@id=\"content\"]/p")).getText();
	//WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/p")) ;
	//	String innertext = text.getText();
		//System.out.println("content is "+innertext);
		   // driver.quit();
			
			
	}
	}
	}
