package String;

import java.util.Scanner;
public class StringSwap
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter First String :");
		String textOne = Key.nextLine();
		System.out.print("Enter Second String :");
		String textTwo = Key.nextLine();
		textOne = textOne + textTwo;
		textTwo = textOne.substring(0, (textOne.length() - textTwo.length()));
		textOne = textOne.substring(textTwo.length());
		System.out.println("\nFirst String :"+textOne);
		System.out.println("Second String :"+textTwo);
		Key.close();
	}
}
