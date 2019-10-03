package guru_selenium;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.graphbuilder.math.VarMap;

public class Datetrail {

	public static void main(String[] args) throws ParseException {
		
		//uploaded
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //Date date1 = sdf.parse("2009-12-31");
       // Date date2 = sdf.parse("2010-01-31");
		//Date date1 = sdf.parse("21-09-2019");
		//Date date2 = sdf.parse("16-09-2019");
		//----------------------------------
		Date curdate = new Date();
		SimpleDateFormat formatedate = new SimpleDateFormat("dd-MM-yyyy");
		//String date2 = formatedate.format(curdate);
		String date2 = curdate.toString();
		System.out.println(date2);
		//String str = date2.toString();
		String str = formatedate.format(date2);
		System.out.println(str);
		//String date1 = "21-09-2019";
		//System.out.println(date2+"------>"+date1);
	//------------------------	
       // System.out.println("date1 : " + sdf.format(date1));
       // System.out.println("date2 : " + sdf.format(date2));

       /* if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }*/
		String startDate = "12/09/2014 ";

		//String endDate = curdate.toString();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("startdate"+startDate+"end date"+str);
		//System.out.println(sdf.parse(startDate).before(sdf.parse(str)));
		
		 if (startDate.compareTo(str) > 0) {
             System.out.println("start is after end");
         } else if (startDate.compareTo(str) < 0) {
             System.out.println("start is before end");
         } else if (startDate.compareTo(str) == 0) {
             System.out.println("start is equal to end");
         } else {
             System.out.println("Something weird happened...");
         }

     
		

	}

}
