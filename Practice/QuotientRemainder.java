package Practice;
import java.util.Scanner;
public class QuotientRemainder
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int numberOne = Key.nextInt();
		int numberTwo = Key.nextInt();
		double quotient;
		int remainder;
		quotient = numberOne / numberTwo;
		System.out.print("The quotient of "+numberOne+" is divided by "+numberTwo+" is "+quotient);
		remainder = numberOne % numberTwo;
		System.out.print("\nThe remainder of "+numberOne+" is divided by "+numberTwo+" is "+remainder);
		Key.close();
	}
}