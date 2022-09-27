package Practice;
import java.util.Scanner;
public class CalculatorSwitch
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int numberOne = Key.nextInt();
		int numberTwo = Key.nextInt();
		System.out.print("Enter an operator(+, -, *, /): ");
		char operator = Key.next().charAt(0);
		double output = 0;
		switch(operator)
		{
			case '+':
				output = numberOne + numberTwo;
				break;
			case '-':
				output = numberOne - numberTwo;
				break;
			case '*':
				output = numberOne * numberTwo;
				break;
			case '/':
				output = numberOne / numberTwo;
				break;
			default:
				System.out.println("You have entered wrong operator");
		}
		System.out.println(numberOne+ " "+operator +" "+numberTwo+": "+output);
		Key.close();
	}
}