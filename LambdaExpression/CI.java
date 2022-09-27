package LambdaExpression;
import java.util.*;
interface Interf
{
	public double compoundInterest(double a, double b, double c);
}
public class CI 
{
	public static void main(String args[])
		 {
			 Scanner Key = new Scanner(System.in);
			 System.out.print("Enter the principle: ");
			 double p = Key.nextDouble();
			 System.out.print("Enter the rate of interest: ");
			 double r = Key.nextDouble();
			 System.out.print("Enter the time in years: ");
			 double t = Key.nextDouble();
			 Interf ci = (a, b, c) -> {return a*Math.pow((1+b/100),c) - a;};		//Lambda Expression
			 System.out.println(ci.compoundInterest(p, r, t));
			 Key.close();
		 }
}