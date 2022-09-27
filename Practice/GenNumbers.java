package Practice;
public class GenNumbers
{
	public static void main(String args[])
	{
		double randomNumber = Math.random();		
		randomNumber *=10;
		randomNumber++;
		int genNumber = (int)randomNumber;
		if(genNumber%2==0)
			System.out.println(genNumber+" is even");
		else
			System.out.println(genNumber+" is odd");
	}
}