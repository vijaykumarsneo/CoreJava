package Number;
import java.util.Scanner;
public class PalindromeNumber 
{
	public static int reverse(int i)
	{
		int result = 0;
		while(i > 0)
		{
			result = result * 10 + i%10;
			i = i/10;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Key.nextInt();
		if(number == reverse(number) )
		{
			System.out.println(number+" is a Palindrome");
		}
		else
		{
			System.out.println(number+" is not a Palindrome");
		}
		Key.close();
	}
}
