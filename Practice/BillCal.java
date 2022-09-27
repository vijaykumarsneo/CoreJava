package Practice;
public class BillCal
{
	public static void main(String args[])
	{
		int totalBill = 0;
		int price=0;
		for (int i = 0; i<args.length; i++)
		{
			price = Integer.parseInt(args[i]);
			totalBill=totalBill+price;
		}
		System.out.println("totalbill: " +totalBill);
	}
}