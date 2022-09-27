package String;

import java.util.Scanner;
public class ReplaceSpaces
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String :");
		String text = Key.nextLine();
		text = text.replace(' ','-');
		System.out.print("String replaced with specific character :");
		System.out.println(text);	
		Key.close();
	}
}