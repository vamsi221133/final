package guru_selenium;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGuru {

	public static void main(String[] args) {

		WebDriver driver = null ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://connect.maveric-systems.com/index.php/site/login");
		Date a = new Date();
		
		System.out.println("date is "+a);

	}

}
