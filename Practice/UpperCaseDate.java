package Practice;
import java.util.Date;
public class UpperCaseDate
{
	public static void main(String args[])
	{
		Date myDate = new Date();
		String myString = myDate.toString();
		String myObject1 = myString.toUpperCase();
		System.out.println("Today's date is "+myObject1);
		String myObject2 = myString.toLowerCase();
		System.out.println("Today's date is "+myObject2);
	}
}