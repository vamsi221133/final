package practicle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		POM1stProgram pom = new POM1stProgram();
		pom.FName(driver).sendKeys("krishna");
		pom.Mailid(driver).sendKeys("dsfas");
		pom.btn(driver).click();
		Thread.sleep(3000);
		pom.ckbox(driver).click();
		pom.pw(driver).sendKeys("vamsikrishana");
		Thread.sleep(2000);
		pom.repw(driver).sendKeys("vamsikrishana");
		Thread.sleep(2000);
		pom.altmail(driver).sendKeys("vmskrshn@gmail.com");
		pom.Phno(driver).sendKeys("1234567890");
		Thread.sleep(2000);
		pom.DOB(driver);
		pom.captcha(driver).sendKeys("1234");
		

	}

}
