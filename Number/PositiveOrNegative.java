package Number;

import java.util.Scanner;

public class PositiveOrNegative
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = Key.nextInt();
		
		if(number > 0)
		{
			System.out.println("It is a positive number.");
		}
		else if(number < 0)
		{
			System.out.println("It is a negative number.");
		}
		else
		{			
			System.out.println("It is zero! Nor negetive or positive number");
		}
		Key.close();
	}
}