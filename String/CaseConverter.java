package String;

import java.util.Scanner;
public class CaseConverter
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Write a String: ");
		String line = Key.nextLine();
		char[] ch = line.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
			else if(Character.isUpperCase(ch[i]))
			{
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		String changedCase = new String(ch);
		System.out.print("Case Convertion of the String :"+changedCase);
		Key.close();
	}
}