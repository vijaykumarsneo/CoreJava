package Number;

import java.util.Scanner;
public class RangeOfPrimeNumbers
{
    public static void main(String args[]) 
	{
        boolean isPrime;
		int primeNumbersCount = 0;
        Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = Key.nextInt();
		System.out.println("The prime numbers upto "+number+" are: ");
		for(int i = 1; i<=number; i++)
		{
			if(i < 2) 
				isPrime = false;
			else 
				isPrime = true;
			for(int x = 2; x <= i / x; x++)
			{
				if ((i % x) == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i +"|");
				primeNumbersCount++;
			}
		}
		System.out.println("\nTotal prime numbers are: "+primeNumbersCount);
		Key.close();
    }
}