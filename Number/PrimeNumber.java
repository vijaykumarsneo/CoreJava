//Prime Number program with user input

package Number;
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[]) 
	{
        boolean isPrime;
		System.out.print("Enter a number: ");
		Scanner Key = new Scanner(System.in);
		int num = Key.nextInt();
        if (num < 2) 
          isPrime = false;
        else 
          isPrime = true;
        for (int i = 2; i <= num / i; i++)
		{
            if ((num % i) == 0)
			{
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
          System.out.println("Prime");
        else 
          System.out.println("Not Prime");
        Key.close();
    }
}