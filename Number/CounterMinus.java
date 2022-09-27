package Number;

import java.util.Scanner;

public class CounterMinus
{
	public static void main(String agrs[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		
		while(number > 0)
		{
			System.out.print(number+" ");
			number --;
		}
		in.close();
	}
}	