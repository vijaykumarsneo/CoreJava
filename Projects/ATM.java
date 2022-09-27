package Projects;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ATM
{
	private static Integer totalBalance=0;
	private static Map<Integer,Integer> bankMap;
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{ 
		
		bankMap = new TreeMap<>(Comparator.reverseOrder());
		bankMap.put(10,100);
		bankMap.put(20,100);
		bankMap.put(50,5);
		bankMap.put(100,50);
		bankMap.put(200,5);
		bankMap.put(500,5);
		bankMap.put(2000,5);
		
		System.out.println("Enter 1 for Deposit or 2 for Withdraw");
		 Integer input=sc.nextInt();
		 
		 if(input==1)
			depositMoney();
		 else if(input==2)
			 withdrawMoney();
		 else 
			 System.out.println("You entered different number apart from 1 or 2. Please try again from starting");;
		
	}
	
	public static void depositMoney() 
	{
		totalBalance = 2000*bankMap.get(2000) + 500*bankMap.get(500) + 200*bankMap.get(200) + 
				100*bankMap.get(100) + 50*bankMap.get(50) + 20*bankMap.get(20) + 10*bankMap.get(10);
		
	 System.out.println("Total available balance in ATM before depositing "+totalBalance);
	 
	 
		System.out.println("Enter no of 2000 notes");
		Integer note2000=sc.nextInt();
		
		System.out.println("Enter no of 500 notes");
		Integer note500=sc.nextInt();
		
		System.out.println("Enter no of 200 notes");
		Integer note200=sc.nextInt();
		
		System.out.println("Enter no of 100 notes");
		Integer note100=sc.nextInt();
		
		System.out.println("Enter no of 50 notes");
		Integer note50=sc.nextInt();
		
		System.out.println("Enter no of 20 notes");
		Integer note20=sc.nextInt();
		
		System.out.println("Enter no of 10 notes");
		Integer note10=sc.nextInt();
		
		System.out.println();
		 System.out.println("Available denominations before depositing money in ATM ");
		 System.out.println(bankMap);
		 
		for(Map.Entry<Integer,Integer> m : bankMap.entrySet())
		{
			if((Integer)m.getKey()==2000)
				bankMap.put(2000,(Integer)m.getValue()+note2000);
	
			else if((Integer)m.getKey()==500)
				bankMap.put(500,(Integer)m.getValue()+note500);
			
			else if((Integer)m.getKey()==200)
				bankMap.put(200,(Integer)m.getValue()+note200);
			
			else if((Integer)m.getKey()==100)
				bankMap.put(100,(Integer)m.getValue()+note100);
			
			else if((Integer)m.getKey()==50)
				bankMap.put(50,(Integer)m.getValue()+note50);
			
			else if((Integer)m.getKey()==20)
				bankMap.put(20,(Integer)m.getValue()+note20);
			
			else
				bankMap.put(10,(Integer)m.getValue()+note10);
		}
		
		totalBalance = 2000*bankMap.get(2000) + 500*bankMap.get(500) + 200*bankMap.get(200) + 
				100*bankMap.get(100) + 50*bankMap.get(50) + 20*bankMap.get(20) + 10*bankMap.get(10);
		
		Integer totalDeposit=note2000*2000 + note500*500  + note200*200  + note100*100  + note50*50  + note20*20  + note10*10 ;
		 
		 System.out.println();
		System.out.println("You are trying to insert total amount "+totalDeposit);
		System.out.println("Total balance in your account is : "+totalBalance);
		System.out.println("After depositing the money available denominatins are ");
		
		//bankMap.entrySet().stream().forEach(map ->
		//System.out.println(+map.getKey()+" notes "+map.getValue()));
		
		System.out.println(bankMap);
	}

	public static void withdrawMoney() 
	{
		totalBalance = 2000*bankMap.get(2000) + 500*bankMap.get(500) + 200*bankMap.get(200) + 
				100*bankMap.get(100) + 50*bankMap.get(50) + 20*bankMap.get(20) + 10*bankMap.get(10);
		
		System.out.println("Please enter amount which less than your account balance "+totalBalance);
		Integer amount = sc.nextInt();
		
		if(amount<=0 || amount%2 !=0 || totalBalance<amount )
			System.out.println("Please enter the proper amount to Withdraw");
		
		else
		{
			
			 System.out.println("Available denominations in ATM before withdrawing ");
			 System.out.println(bankMap);
			
		 while(bankMap.get(2000)>=1 && amount>=2000 )
		 {
			 totalBalance = totalBalance-2000;
			 amount=amount-2000;
			 bankMap.put(2000, bankMap.get(2000)-1);
		 }
		 while(bankMap.get(500)>=1 && amount>=500 )
		 {
			 totalBalance = totalBalance-500;
			 amount=amount-500;
			 bankMap.put(500, bankMap.get(500)-1);
		 }
		 while(bankMap.get(200)>=1 && amount>=200 )
		 {
			 totalBalance = totalBalance-200;
			 amount=amount-200;
			 bankMap.put(200, bankMap.get(200)-1);
		 }
		 while(bankMap.get(100)>=1 && amount>=100 )
		 {
			 totalBalance = totalBalance-100;
			 amount=amount-100;
			 System.out.println(totalBalance);
			 bankMap.put(100, bankMap.get(100)-1);
		 }
		 while(bankMap.get(50)>=1 && amount>=50 )
		 {
			 totalBalance = totalBalance-50;
			 amount=amount-50;
			 bankMap.put(50, bankMap.get(50)-1);
		 }
		 while(bankMap.get(20)>=1 && amount>=20 )
		 {
			 totalBalance = totalBalance-20;
			 amount=amount-20;
			 bankMap.put(20, bankMap.get(20)-1);
		 }
		 while(bankMap.get(10)>=1 && amount>=10 )
		 {
			 totalBalance = totalBalance-10;
			 amount=amount-10;
			 bankMap.put(10, bankMap.get(10)-1);
		 }
		 System.out.println();
		 System.out.println("Remaining Balance in your Account "+totalBalance);
		 System.out.println();
		 System.out.println("Remaining denominations available in ATM ");
		 System.out.println(bankMap);
		}
	}

}