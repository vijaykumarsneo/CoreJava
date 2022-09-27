//Even or Odd program with user input

package Number;
import java.util.Scanner;
public class EvenOddNumber 
{
		public static void main(String[] args) 
		{
			Scanner Key = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = Key.nextInt();
			if(number % 2 == 0)
				System.out.println(number + " is an even number");
			else
				System.out.println(number + " is an odd number");
			Key.close();
		}
}
