package Number;

import java.util.Scanner;

public class CounterPlus
{
	public static void main(String agrs[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		int i = 1;
		while(i<=number)
		{
			System.out.print(i+" ");
			i++;
		}
		in.close();
	}
}	