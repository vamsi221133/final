package guru_selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.findElement(By.xpath("//input[@name=\"LoginForm[username]\"]")).sendKeys("vamsikrishnaa");
		driver.findElement(By.xpath("//input[@name=\"LoginForm[password]\"]")).sendKeys("Maveric123$");
		driver.findElement(By.name("yt0")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele2 =   driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[8]"));
		act.moveToElement(ele2);
		Thread.sleep(2000);
		WebElement mytc =  driver.findElement(By.xpath("(//a[@href=\"/index.php/Timesheetitems/mytimecard\"])"));
		act.moveToElement(mytc);
		act.click().build().perform();
		Thread.sleep(2000);
		String mytimecard1  =   driver.findElement(By.xpath("(//tr[@class='odd']//td[3])[1]")).getText();
		String mtc2 = mytimecard1.toString();
		Thread.sleep(2000);
		String string = mtc2.substring(14);
		
		//String lastsub = lasts.substring(1, 15);
		System.out.println(string);
		
		Date curdate = new Date();
		SimpleDateFormat formatedate = new SimpleDateFormat("dd-MM-yyyy");
		String date2 = formatedate.format(curdate);
		System.out.println(date2);
		String currentdate = date2.toString();
		System.out.println(currentdate);
		String tcdate = string;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("startdate"+tcdate+"end date"+currentdate);
		//System.out.println(sdf.parse(startDate).before(sdf.parse(str)));
		
		 if (tcdate.compareTo(currentdate) > 0) {
             System.out.println("tc is not yet submitted");
         } else if (tcdate.compareTo(currentdate) < 0) {
             System.out.println("tc already submited");
         } else if (tcdate.compareTo(currentdate) == 0) {
             System.out.println("submit today");
         } else {
             System.out.println("Something weird happened...");
         }


	}

}
