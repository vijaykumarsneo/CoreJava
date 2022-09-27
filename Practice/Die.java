package Practice;

public class Die
{
	public static void main(String args[])
	{
		double randomNumber = Math.random();		
		randomNumber *= 6;
		randomNumber++;
		int dieValue = (int)randomNumber;
		System.out.println(dieValue);
	}
}