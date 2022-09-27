package Practice;
public class BillCalc
{
	public static void main(String args[])
	{		
		int sum = 0;
		String[] foodItems = new String[4];
		foodItems[0] = "dosa";
		foodItems[1] = "wada";
		foodItems[2] = "idli";
		foodItems[3] = "poori";
		for(int i = 0; i<args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
			System.out.println(foodItems[i] + " = " + args[i]);
		}
		System.out.println("------------------");
		System.out.println("Total bill is "+"$"+sum);
		System.out.println("------------------");
	}
}