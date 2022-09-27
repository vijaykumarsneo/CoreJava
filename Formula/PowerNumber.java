package Formula;
import java.util.Scanner;
public class PowerNumber
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter base number :");
		int base = Key.nextInt();
		System.out.print("Enter exponent number :");
		int exponent = Key.nextInt();
		double result = Math.pow(base, exponent);
		System.out.println(base +" power of " +exponent +" is "+result);
		Key.close();
	}
}			