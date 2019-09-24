package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPvdr {
	
	@Test(dataProvider="dP")
	public void f(Integer n,String s) {
		System.out.println("integer :"+n+"and String"+s);
	}
//sdfgsddfgdfg
	@DataProvider public Object[][] dP()
	{
		return new Object[][]
		{
			new Object[]{1,"a"},
			new Object[]{2,"b"},};
		}
		
	}

