package String;

import java.util.Scanner;
public class PunctuationsCount
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Write a String: ");
		String line = Key.nextLine();
		int charPunCount = 0;
		for(int i = 0; i< line.length(); i++)
		{
			if(line.charAt(i) == '!' ||line.charAt(i) == '?' ||line.charAt(i) == ','||line.charAt(i) == '.'||line.charAt(i) == '\''||line.charAt(i) == '\"'||line.charAt(i) == ';'||line.charAt(i) == ':')
			{
				charPunCount++;
			}
		}
		System.out.println("Number of punctuations in the String: " +charPunCount);
		Key.close();
	}
}