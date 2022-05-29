import java.util.Scanner;

public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = Key.nextInt();
		
		int squareRoot = (int)Math.sqrt(number);
		
		System.out.println("Square of "+number+" is "+squareRoot);
		Key.close();
	}
}