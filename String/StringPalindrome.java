package String;

import java.util.Scanner;
public class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String :");	//Ex: MOM is palindrome
		String text = Key.next();
		boolean status = true;
		for(int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) != text.charAt(text.length()-i-1))
			{
				status = false;
				break;
			}
		}
		if(status)
			System.out.println(text+" is Palindrom");
		else
			System.out.println(text+" is not Palindrom");
		Key.close();
	}
}