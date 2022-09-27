package Number;

import java.util.Scanner;

public class CountDigitString
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a numner: ");
		int number = Key.nextInt();
		String num = Integer.toString(number);
		int count = num.length();
		System.out.print("Number of digits: "+count);
		Key.close();
	}
}