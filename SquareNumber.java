import java.util.Scanner;
public class SquareNumber
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = Key.nextInt();
		int squareNumber = number * number;
		System.out.println("Square of "+number+" is "+squareNumber);
		Key.close();
	}
}