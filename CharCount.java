import java.util.Scanner;
public class CharCount
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Write a sentence: ");
		String line = Key.nextLine();
		int charCount = 0;
		for(int i = 0; i< line.length(); i++)
		{
			if(line.charAt(i) != ' ')
			{
				charCount++;
			}
		}
		System.out.println("Number of chars in the sentence: " +charCount);
		Key.close();
	}
}