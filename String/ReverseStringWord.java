package String;

import java.util.Scanner;
public class ReverseStringWord
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Write a string: ");
		String line = Key.nextLine(); 
		String word[] = line.split(" ");
		System.out.print("Reverse of the string word by word: ");
		for(int i = word.length-1; i>=0; i--)
		{
			System.out.print(word[i]+" ");
		}
		Key.close();
	}
}