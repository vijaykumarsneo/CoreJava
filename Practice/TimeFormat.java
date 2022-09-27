package Practice;
import java.util.Date;
import java.util.Formatter;
public class TimeFormat
{
	public static void main(String args[])
	{
		Date myDate = new Date();
		Formatter myDateFormatter = new Formatter();
		//(24 hrs time format hrs and mins)
		myDateFormatter.format("%tR", myDate);	//13:00	
		System.out.println(myDateFormatter);
		//(24 hrs time format hrs, mins and secs)
		myDateFormatter.format("%tT", myDate);	//13:00:00 
		System.out.println(myDateFormatter);
		//(12 hrs time format hrs, mins and secs & AM or PM)
		myDateFormatter.format("%tr", myDate);	//1:00:00 PM 
		System.out.println(myDateFormatter);
		//(Date format as month, date and year)
		myDateFormatter.format("%tD", myDate);	//04/29/22 
		System.out.println(myDateFormatter);
		//(Date format as year, month and date)
		myDateFormatter.format("%tF", myDate);	//2022-04-29 
		System.out.println(myDateFormatter);
		//(Date and Time format as dayname, monthname, date, hrs, mins, secs, zone and year) 
		myDateFormatter.format("%tc", myDate);	//Fri Apr 29 1:00:00 IST 2022 
		System.out.println(myDateFormatter);
	}
}