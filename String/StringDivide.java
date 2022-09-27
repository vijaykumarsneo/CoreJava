package String;

import java.util.Scanner;
public class StringDivide
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str = Key.nextLine();
		System.out.print("Enter a number to divide String into parts :");
		int numberOfParts = Key.nextInt();
		int temp = 0;
		int chars = str.length()/numberOfParts;
		String[] equalStr = new String[numberOfParts];
		if(str.length() % numberOfParts != 0)
		{
			System.out.println("Sorry this string cannot be divided into "+numberOfParts +" equal parts.");
		}
		else
		{
			for(int i=0; i<str.length(); i=i+chars)
			{
				String part = str.substring(i, i+chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(numberOfParts + " of equal parts of given string are :");
			for(int i = 0; i<equalStr.length; i++)
			{
				System.out.println(equalStr[i]);
			}
		}
		Key.close();
	}
}