package vamsi;

import static org.junit.Assert.fail;
import java.text.SimpleDateFormat;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SubTimeCard {
	
	

public WebElement  username(WebDriver driver) {
		
		WebElement	element = driver.findElement(By.id("LoginForm_username"));
		
		return element;
		}	
	
public  WebElement  password(WebDriver driver) throws InterruptedException {
		
		WebElement	element1 = driver.findElement(By.id("LoginForm_password"));
		return element1;
		}

public  WebElement timecard(WebDriver driver) throws InterruptedException {

	Actions act = new Actions(driver);
	/*WebElement ele =   driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[8]"));
	act.moveToElement(ele);
	Thread.sleep(2000);
	WebElement mytimecard  =   driver.findElement(By.xpath("//a[@href=\"/index.php/Timesheetitems/create\"]"));
	act.moveToElement(mytimecard);
	Thread.sleep(2000);
	act.click().build().perform();
	
	String mytimecard1  =   driver.findElement(By.xpath("(//tr[@class=\"odd\"]//td[3])[1]")).getText();
	String mtc2 = mytimecard1.toString();
	Thread.sleep(2000);
	String string = mtc2.substring(14);
	 String pattern = "dd-MM-yyyy";
	 String dateInString =new SimpleDateFormat(pattern).format(new Date());
	System.out.println("current date is "+dateInString);
	StringBuffer texttime = new StringBuffer(string);
	String string1 = texttime.substring(14);
	System.out.println("the string value is "+string);*/
	Thread.sleep(2000);
	
	
	WebElement elem =   driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[8]"));
	act.moveToElement(elem);
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
    WebElement ele2 =   driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[8]"));
	act.moveToElement(ele2);
	Thread.sleep(2000);
	WebElement TS = driver.findElement(By.xpath("(//a[@href='/index.php/Timesheetitems/create'])"));
	act.moveToElement(TS);
	Thread.sleep(2000);
	act.click().build().perform();
	driver.findElement(By.xpath("//select[@onchange='textchange()']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@onchange='textchange()']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[sub_project_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']//option[19]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']//option[3]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration2']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration3']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration4']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration5']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration6']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration7']")).sendKeys("0");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	Thread.sleep(2000);
	
	
	////for leave
	driver.findElement(By.xpath("//select[@onchange='textchange()']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@onchange='textchange()']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']//option[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[sub_project_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']//option[14]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']//option[3]")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration2']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration3']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration4']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration5']")).sendKeys("0");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration6']")).sendKeys("8");
	Thread.sleep(1200);
	driver.findElement(By.xpath("//input[@id='TimesheetItems_duration7']")).sendKeys("8");
	Thread.sleep(1200);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement element	= driver.findElement(By.xpath("//input[@value='Save']"));
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();",element);
	element.click();
	Thread.sleep(2000);
	
	WebElement element1	= driver.findElement(By.xpath("//input[@id='submitweekly']"));
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();",element1);
	element1.click();
	Thread.sleep(2000);
	System.out.println("time cards submited successfully");
	 } 
	 else if (tcdate.compareTo(currentdate) < 0)
	 {
         System.out.println("tc already submited");
     } 
	 else if (tcdate.compareTo(currentdate) == 0) {
         System.out.println("please verify wether the time card is submited or not");
     } 
	 
	return mytc;
}
	//logout
public  WebElement  logout(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions act = new Actions(driver);
	//logout
	WebElement element3	= driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[9]"));
	js.executeScript("arguments[0].scrollIntoView();",element3);
	Thread.sleep(1000);
	act.moveToElement(element3);
	Thread.sleep(1000);
	WebElement element4 = driver.findElement(By.xpath("(//a[@href='/index.php/site/logout'])"));
	act.moveToElement(element4);
	Thread.sleep(2000);
	act.click().build().perform();
	Thread.sleep(2000);
	System.out.println("log out successfully initiated");
	return null;
}
}
	
