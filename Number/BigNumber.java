package Number;

import java.util.Scanner;
public class BigNumber
{
	 public static void main(String args[])
	 {
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter first number :");
		int a = Key.nextInt();
		System.out.print("Enter second number :");
		int b = Key.nextInt();
		System.out.print("Enter third number :");
		int c = Key.nextInt();
		if(a >= b && a >= c)
			System.out.println(a +" is the largest number.");
		else if(b >= c && b >= a)
			System.out.println(b +" is the largest number.");
		else
			System.out.println(c +" is the largest number.");
		if(a==b || b==c || c==a)
		{
			if((a>c && b>c) || (a<c && b<c))
				System.out.println("First and Second are equal numbers");
			else if((b>a && c>a) || (b<a && c<a))
				System.out.println("Second and Third are equal numbers");
			else if((c>b && a>b) || (c<b && a<b))
				System.out.println("Third and First are equal numbers");
		}
		if(a==b && b==c && c==a)
			System.out.println("Three numbers are equal");
		Key.close();
	}
}
		