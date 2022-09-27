package Number;
import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		int remainder, originalNumber, result = 0;
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Key.nextInt();
		originalNumber = number;
		while(number > 0)
		{
			remainder = number % 10;
			number = number / 10;
			result = result + (remainder*remainder*remainder);
		}
		if(originalNumber == result)
		{
			System.out.println(originalNumber+" is Armstrong number.");
		}
		else
		{
			System.out.println(originalNumber +" is not an Armstrong number.");
		}
		Key.close();
	}
}