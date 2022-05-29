import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number :");		
		int number = Key.nextInt();
		int reversedNumber = 0;
		
		while(number != 0)
		{
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number/10;
		}
		System.out.print("\nThe reverse number :"+reversedNumber);
		Key.close();
	}
}