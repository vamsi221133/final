package vamsi;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;


public class TablesAction {
	public static void screenshot(WebDriver driver) throws InterruptedException, IOException
	{
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
	
		for(int i = 1; i < 3 ;i ++)
		{
			System.out.println(i);
			Thread.sleep(2000);
			Thread.sleep(1000);
			File DestFile = new File("C:/Users/Dell/Desktop/selenium/sc"+i+".jpg");
			Thread.sleep(1000);
			Files.copy(scrfile, DestFile);
			System.out.println("screen shot saved successful");
	}
	//WebElement scJ (WebDriver driver)
	{
		
	}
	}
	

}
