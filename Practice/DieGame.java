package Practice;

public class DieGame
{
	public static void main(String args[])
	{
		int dieValue = 0;
		do
		{
			double randomNumber = Math.random();
			
			randomNumber *=6;
			
			randomNumber++;
			
			dieValue = (int)randomNumber;
			
			System.out.println("You have thrown a "+dieValue);
		
		}while(dieValue != 6);
		
		System.out.println("Well done, you can start the game");
	}
}