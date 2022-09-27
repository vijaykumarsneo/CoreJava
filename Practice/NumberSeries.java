package Practice;
public class NumberSeries
{
	public static int findNextSeries(int n)
	{
		return (int) (3 * Math.pow(n,2) - n + 2)/(2);
	}	
	public static void main(String args[])
	{
		int series[]=new int[100];
		for(int i=0; i<100; i++)
		{
			series[i] = findNextSeries(i);
			System.out.print(series[i]);
			System.out.print(",");
		}
	}
}