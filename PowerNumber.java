import java.util.Scanner;
public class PowerNumber
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter base number :");
		int baseNumber = Key.nextInt();
		System.out.print("Enter power number :");
		int powerNumber = Key.nextInt();
		int result = (int)Math.pow(baseNumber, powerNumber);
		System.out.println(baseNumber +" power of " +powerNumber +" is "+result);
	}
}			