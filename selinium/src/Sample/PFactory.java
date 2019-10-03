package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFactory {

	@FindBy(xpath="//*[@id='LoginForm_username']")
	WebElement username;
	@FindBy(xpath="//*[@id='LoginForm_password']")
	WebElement password;
	@FindBy(name="yt0")
	WebElement submit;
	
	private WebDriver driver;
	public PFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}
