package Practice;

public class CoinToss
{
	public static void main(String args[])
	{
		double randomNumber = Math.random();
		if(randomNumber < 0.5)
		{
			System.out.println("The coin shows heads");
		}
		else
		{
			System.out.println("The coin shows tails");
		}
	}
}