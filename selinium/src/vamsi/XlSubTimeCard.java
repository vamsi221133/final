package vamsi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XlSubTimeCard {
	
	
	public static void main(String args[]) throws IOException, InterruptedException{
	
		WebDriver driver = null ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		//poi
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\vamsi\\selenium_trails\\usernames.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("usernames");
		int rowc = ws.getLastRowNum();
		System.out.println("total number of rows are : "+rowc);
		
		int colmn = ws.getRow(0).getLastCellNum();
		System.out.println("total number of columns are"+colmn);
		
		for (int i = 1 ; i < rowc + 1 ; i++)
		{
			for (int j = 0 ; j<colmn-1 ; j++)
			{
				XSSFCell username = ws.getRow(i).getCell(j);
				System.out.println("username is "+username.toString());
				String id = username.toString();
				driver.findElement(By.id("LoginForm_username")).sendKeys(id);;
				
			for (int k = 1 ; k < colmn ; k++) 
			{
				XSSFCell password = ws.getRow(i).getCell(k);
				String pw = password.toString();
				System.out.println("password is "+pw);
				driver.findElement(By.id("LoginForm_password")).sendKeys(pw);
				SubTimeCard STC = new SubTimeCard();
				driver.findElement(By.name("yt0")).click();
				Thread.sleep(2000);
				STC.timecard(driver);
				STC.logout(driver);
			}
		}
		}
	}
}
