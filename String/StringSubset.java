package String;

import java.util.Scanner;
public class StringSubset
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String text = Key.nextLine();
		int length = text.length();
		int temp = 0;
		String arr[] = new String[length *(length + 1)/2];
		for(int i = 0; i < length; i++)
		{
			for(int j = i; j < length; j++)
			{
				arr[temp] = text.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("All subsets for given string are: ");
		for( int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);	
		}
		Key.close();
	}
}