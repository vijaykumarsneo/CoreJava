package Practice;
public class Bill
{
	public static void main(String args[])
	{
		int dosaprice=35;
		int pooriprice =35;
		int teaprice=12;
		int total;
		double finalbill;

		total= dosaprice+pooriprice+teaprice;
		finalbill=(0.05* total) + total; 	//5% Tax on total

		System.out.println("Total Bill: "+total);

		System.out.println("Final Bill: "+finalbill);
	}
}   