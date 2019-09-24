package vamsi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class Tables {

	public static <var> void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		//th[@scope='row'])[2]
		//Actions act = new Actions(driver);
		String str = "Clock Tower Hotel";
		WebElement str1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]"));
		//WebElement str1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='Burj Khalifa']//following-sibling::td[3]"));
		System.out.println("table content is "+str1.getText());
		System.out.println("table content is "+str1.getLocation());
		System.out.println("table content is "+str1.getTagName());
		System.out.println(str1.isDisplayed());
		System.out.println(str1.getRect());
		driver.quit();
		//System.out.println("table content is "+str1.toString());
		
		//the following loop is based on date and time
		/*TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		
		for(int i = 1; i <= 5 ;i ++)
		{
			System.out.println(i);
			Thread.sleep(2000);
			Date d = new Date();
			long n = d.getTime();
			String name = "sc"+n+".jpg";
			Thread.sleep(1000);
			File DestFile = new File("C:/Users/Dell/Desktop/selenium/"+name+"");
			Thread.sleep(1000);
			Files.copy(scrfile, DestFile);
			System.out.println("screen shot saved successful");
	}*/
		//TablesAction.screenshot(driver);
}
}