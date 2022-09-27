package String;


import java.util.Scanner;
public class RemoveWhiteSpaces
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String :");
		String line = Key.nextLine();
		line = line.replaceAll(" ","");
		System.out.println("The String without white spaces :"+line);
		Key.close();
	}
}