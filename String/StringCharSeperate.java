package String;

import java.util.Scanner;
public class StringCharSeperate 
{
    public static void main(String[] args)
    {
        Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String :");
		String string = Key.nextLine();;
        System.out.println("Individual characters from given string: ");
        for (int i = 0; i < string.length(); i++)
		{
            System.out.print(string.charAt(i) + " ");
		}
        Key.close();
	}
}