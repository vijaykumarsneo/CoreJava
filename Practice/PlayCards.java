package Practice;
public class PlayCards
{
	public static void main(String args[])
	{
		double randomNumber = Math.random();		
		randomNumber *=13;
		randomNumber++;
		int cardNumber = (int)randomNumber;
		switch(cardNumber)
		{
			case 1: System.out.println("Ace");
			break;
			case 11: System.out.println("Jack");
			break;
			case 12: System.out.println("Queen");
			break;
			case 13: System.out.println("King");
			break;
			default: System.out.println(cardNumber);
		}
	}
}