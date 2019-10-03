package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PF {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PFactory pfa = new PFactory(driver);
		pfa.username.sendKeys("12344547");
		pfa.password.sendKeys("987654321");
		pfa.submit.click();

	}

}
