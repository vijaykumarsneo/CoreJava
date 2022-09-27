package Number;
import java.util.Scanner;
public class GCD
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int x = Key.nextInt();
		int y = Key.nextInt();
		int gcd = 1;
		for(int i = 1; i<= x && i<= y; i++)
		{
			if(x % i == 0 && y % i == 0)
				gcd = i;
		}
		System.out.print("GCD of "+x+" and "+y+" is : "+gcd);
		Key.close();
	}
}