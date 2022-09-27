package Formula;

import java.util.Scanner;
public class Emi
{ 
    public static void main(String []args)
    {
        Scanner Key = new Scanner(System.in);
        double principal, rate, time, emi;
        System.out.print("Enter principal: ");
        principal = Key.nextFloat();
        System.out.print("Enter rate: ");
        rate = Key.nextFloat();
        System.out.print("Enter time in year: ");
        time = Key.nextFloat();
        rate = rate/(12*100); 
        time = time*12;
        emi = (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
        System.out.println("Monthly EMI is = "+emi);  
        Key.close();
    }
}

/*

EMI = [P*R*(1+R)^N]/[(1+R)^N -1]

*/