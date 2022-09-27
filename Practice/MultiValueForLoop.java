package Practice;
public class MultiValueForLoop
{
	public static void main(String args[])
	{
		for(int letterCount=1, upperCount=65, lowerCount=97; letterCount<=26; letterCount++, upperCount++, lowerCount++)
		{
			System.out.println("Lower case: "+(char)lowerCount+" Upper case: "+(char)upperCount);
		}
	}
}