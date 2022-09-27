package Formula;

import java.util.Scanner;

public class NaturalNumberSum
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a positive number :");
		int number = Key.nextInt();
		int sum = 0;
		for(int i = 1; i<=number; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of first "+number +" natuaral numbers is "+sum);
		Key.close();
	}
}