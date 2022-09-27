package Practice;
public class ArrayForLoop
{
	public static void main(String args[])
	{
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};		
		int[] monthlyRainfall = {74, 81, 86, 93, 100, 116, 126, 11, 93, 80, 84, 91};
		System.out.println("Average Monthly Rainfall");
		for(int i=0; i < monthlyRainfall.length; i++)
		{
			System.out.println(monthNames[i] +": " + monthlyRainfall[i] + "mm. ");
		}
	}
}