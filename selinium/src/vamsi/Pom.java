package vamsi;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom {
	
	
	public static WebElement  username(WebDriver driver) {
		
		WebElement	element = driver.findElement(By.id("LoginForm_username"));
		return element;
		}	
	
	public static WebElement  password(WebDriver driver) {
		
		WebElement	element = driver.findElement(By.xpath("//*[@id=\\\"LoginForm_password\\\"]"));
		return element;
		
		
	
	
	}
	
	
}

	


