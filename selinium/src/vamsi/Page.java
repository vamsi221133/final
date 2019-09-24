package vamsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	@FindBy(xpath="//*[@id=\"LoginForm_username\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"LoginForm_password\"]")
	WebElement password;

	private WebDriver driver;

	public Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);	
	}

	
}
