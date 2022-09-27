package Number;

import java.util.Scanner;

public class LargeOfThree
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int numberOne = Key.nextInt();
		int numberTwo = Key.nextInt();
		int numberThree = Key.nextInt();
		
		int theLarge = numberOne > numberTwo ? numberOne : numberTwo;
		int theLargest = numberThree > theLarge ? numberThree : theLarge;
		
		System.out.println("The biggest number is "+theLargest);
		Key.close();
	}
}