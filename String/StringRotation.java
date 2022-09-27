package String;

import java.util.Scanner;
public class StringRotation
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter first String :");
		String textOne = Key.nextLine();
		System.out.print("Enter second String :");
		String textTwo = Key.nextLine();
		if(textOne.length() != textTwo.length())
		{
			System.out.print("Second string is not a rotation of first string");
		}
		else
		{
			textOne = textOne.concat(textOne);
			if(textOne.indexOf(textTwo)!= -1)
				System.out.println("Second string is a rotation of first string");
			else
				System.out.println("Second string is not a rotation of first string");
		}
		Key.close();
	}
}