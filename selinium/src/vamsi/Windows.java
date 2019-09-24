package vamsi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("button1")).click();
		//WebElement ele = driver.findElement(By.xpath("//*[@onclick='if (!window.__cfRLUnblockHandlers) return false; newMsgWin()']"));
		//ele.click();
		
		String mainwindow = driver.getWindowHandle();
		Set <String> s1=driver.getWindowHandles();//to handle all new opened windows
		Iterator<String> i1 = s1.iterator();
		System.out.println("id for existing window :"+mainwindow);
		System.out.println("id for new"+s1);
		while(i1.hasNext())
		{
			String childwindow = i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				//switching to chaild window
				Thread.sleep(8000);
				driver.switchTo().window(childwindow);
				driver.close();
			}			
		}//switching to parent window
	}
}
