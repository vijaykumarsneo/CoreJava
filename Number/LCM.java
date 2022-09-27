package Number;
import java.util.Scanner;
public class LCM {

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
		int lcm = (x * y)/gcd;
		System.out.print("LCM of "+x+" and "+y+" is : "+lcm);
		Key.close();
	}
}
