package String;

import java.util.Scanner;
public class StringFreqChar
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.println("Enter a String :");
		String text = Key.nextLine();
		int[] freq = new int[text.length()];
		int i, j;
		char string[] = text.toCharArray();
		for(i = 0; i<text.length(); i++)
		{
			freq[i] = 1;
			for(j = i+1; j<text.length(); j++)
			{
				if(string[i] == string[j])
				{
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and thier corresponding frequencies :");
		for(i = 0; i<freq.length; i++)
		{
			if(string[i] != ' ' && string[i] != '0')
			{
				System.out.println(string[i] + "-" + freq[i]);
			}
		}
	}
}
		