package Number;
import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		int termOne = 0, termTwo = 1, termThree;
		System.out.print("Enter the number of terms: ");
		int terms = Key.nextInt();
		System.out.print("Fibonacci series: ");                      
		for(int i = 1; i <= terms; i++)
		{
			System.out.print(termOne+" ");
			termThree = termOne + termTwo;
			termOne = termTwo;
			termTwo = termThree;
		}
		Key.close();
	}
}