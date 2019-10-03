package practicle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P1testNg {
	
	static WebDriver driver;
	@BeforeTest
	public static void launch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println("before test");
	}
	@Test
	public static void fillup() throws InterruptedException {
		POM1stProgram pom = new POM1stProgram();
		pom.FName(driver).sendKeys("sdfasf");
		pom.Mailid(driver).sendKeys("asdfasdf");
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
	@AfterTest
	public static void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
