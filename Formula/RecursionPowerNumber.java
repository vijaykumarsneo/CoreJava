package Formula;
import java.util.Scanner;
public class RecursionPowerNumber
{
	public static int power(int n, int x)
	{
		if(n != 0)
		{
			return (n*(int)Math.pow(n,x-1));
		}
		else
		{
			return 1;
		}
	}
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);	
		int baseNumber = Key.nextInt();
		int powerNumber = Key.nextInt();
		int powerResult = power(baseNumber,powerNumber);
		System.out.println(powerResult);
		//System.out.println(power(baseNumber,powerNumber));
		Key.close();
	}
}