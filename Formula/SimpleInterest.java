package Formula;

import java.util.Scanner;
public class SimpleInterest
{
	 public static void main(String args[])
	 {
		 Scanner Key = new Scanner(System.in);
		 System.out.print("Enter the principle: ");
		 int principle = Key.nextInt();
		 System.out.print("Enter the rate of interest: ");
		 int rateOfInterest = Key.nextInt();
		 System.out.print("Enter the time in years: ");
		 int time = Key.nextInt();
		 double simpleInterest = (principle*time*rateOfInterest)/100;
		 System.out.println("The simple interest is: "+simpleInterest);
		 double amount = principle + simpleInterest;
		 System.out.println("The amount is: "+amount);
		 Key.close();
	 }
}