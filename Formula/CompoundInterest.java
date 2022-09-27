package Formula;

import java.util.Scanner;
public class CompoundInterest
{
	 public static void main(String args[])
	 {
		 Scanner Key = new Scanner(System.in);
		 System.out.print("Enter the principle: ");
		 double principle = Key.nextDouble();
		 System.out.print("Enter the rate of interest: ");
		 double rateOfInterest = Key.nextDouble();
		 System.out.print("Enter the time in years: ");
		 double time = Key.nextDouble();
		 double compoundInterest =  principle*Math.pow((1+rateOfInterest/100),time) - principle;
		 System.out.println("The compound interest is: "+compoundInterest);
		 Key.close();
	 }
}