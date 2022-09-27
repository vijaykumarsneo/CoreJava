//Reverse Number program with user input

package Number;
import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner Key = new Scanner(System.in);
		int number = Key.nextInt();
		
		int reverse = 0;
		while(number > 0)
		{
			reverse = reverse * 10 + number%10;
			number = number/10;
		}
		System.out.println("Reversed number is "+reverse);
		Key.close();
	}
}
