
package String;
import java.util.Scanner;
public class DupWords
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = Key.nextLine();
		int count;
		String words[] = string.split(" ");
		System.out.println("Duplicate words in the given Srring: ");
		for(int i = 0; i < words.length; i++)
		{
			count =1;
			for(int j = i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "0";
				}
			}
			if(count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
		Key.close();
	}
}