package Formula;

import java.util.Scanner;
public class MultiplyTwoNums
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberOne = Key.nextInt();
		System.out.print("Enter second number: ");
		int numberTwo = Key.nextInt();
		System.out.println("Product of the two numbers: "+(numberOne*numberTwo));
		Key.close();
	}
}
		