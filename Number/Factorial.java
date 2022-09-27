package Number;
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = Key.nextInt();
		int factorial = 1;
		for(int i = 1; i<=number; i++)
		{
			factorial = factorial*i;
		}
		System.out.println("The factorial of "+number+" is "+factorial);
		Key.close();
	}
}