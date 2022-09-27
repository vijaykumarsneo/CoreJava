package Number;

import java.util.Scanner;

public class CountDigit
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a numner: ");
		int number = Key.nextInt();
		int count = 0;
		while(number != 0)
		{
			number = number/10;
			count++;
		}
		System.out.print("Number of digits: "+count);
		Key.close();
	}
}