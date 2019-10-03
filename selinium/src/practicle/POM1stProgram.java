package practicle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class POM1stProgram {
	

public   WebElement FName(WebDriver driver) {
		return driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		}	
public WebElement  Mailid(WebDriver driver) {
	return driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	}	
public WebElement  btn(WebDriver driver) {
	 return driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	}	
public WebElement  ckbox(WebDriver driver) {
	 return driver.findElement(By.xpath("(//div[@id='recommend_text']//tr//td)[1]"));
	
	}	
public WebElement  pw(WebDriver driver) {
	 return driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	
	}
public WebElement  repw(WebDriver driver) {
	 return driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	
	}
public WebElement  altmail(WebDriver driver) {
	return driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	
	}
public WebElement  Phno(WebDriver driver) {
	 return driver.findElement(By.xpath("(//input[@type='text'])[6]"));
	
	}
public WebElement  DOB(WebDriver driver) {
	 driver.findElement(By.xpath("(//select)[2]")).click();
	 driver.findElement(By.xpath("(//select)[2]//option[@value='14']")).click();
	 driver.findElement(By.xpath("(//select)[3]")).click();
	 driver.findElement(By.xpath("(//select)[3]//option[@value='12']")).click();
	 driver.findElement(By.xpath("(//select)[4]")).click();
	 driver.findElement(By.xpath("(//select)[4]//option[23]")).click();
	 driver.findElement(By.xpath("(//input[@value='m'])")).click();
	 driver.findElement(By.id("country")).click();
	 driver.findElement(By.xpath("(//select)[5]//option[1]")).click();
	 driver.findElement(By.xpath("(//select)[6]")).click();
	 driver.findElement(By.xpath("(//select)[6]//option[16]")).click();
	 return null;
	}
public WebElement  captcha(WebDriver driver) {
	return driver.findElement(By.className("captcha"));
	//driver.findElement(By.xpath(""))
	}
}
