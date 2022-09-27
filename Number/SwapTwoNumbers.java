//Swap two numbers without using third variable

package Number;
import java.util.Scanner;
public class SwapTwoNumbers 
{
		public static void main(String[] args)
		{
			Scanner Key = new Scanner(System.in);
			int numberOne = Key.nextInt();
			int numberTwo = Key.nextInt();

			System.out.println("numberOne = "+numberOne + ", numberTwo = "+numberTwo);
			
			numberOne = numberOne* numberTwo;
			numberTwo = numberOne/numberTwo;
			numberOne = numberOne/numberTwo;
			
			System.out.println("numberOne = "+numberOne + ", numberTwo = "+numberTwo);
			Key.close();
		}
}