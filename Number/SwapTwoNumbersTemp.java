//Swap two numbers with using third variable

package Number;
import java.util.Scanner;
public class SwapTwoNumbersTemp 
{
		public static void main(String[] args)
		{
			Scanner Key = new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int numberOne = Key.nextInt();
			int numberTwo = Key.nextInt();
			int numberThree;

			System.out.println("numberOne = "+numberOne + ", numberTwo = "+numberTwo);
			
			numberThree = numberOne;
			numberOne = numberTwo;
			numberTwo = numberThree;
			
			System.out.println("numberOne = "+numberOne + ", numberTwo = "+numberTwo);
			Key.close();
		}
}