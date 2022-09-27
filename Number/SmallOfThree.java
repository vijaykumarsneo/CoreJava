package Number;
import java.util.Scanner;

public class SmallOfThree
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int numberOne = Key.nextInt();
		int numberTwo = Key.nextInt();
		int numberThree = Key.nextInt();
		
		int theSmall = numberOne < numberTwo ? numberOne : numberTwo;
		int theSmallest = numberThree < theSmall ? numberThree : theSmall;
		
		System.out.println("The smallest number is "+theSmallest);
		Key.close();
	}
}