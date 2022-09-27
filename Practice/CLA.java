package Practice;
/** Command Line Arguments */
public class CLA
{
	public static void main(String args[])
	{
		int i;	
		//System.out.println("Command line argument: "+args[0]);
		for(i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		System.out.println("Total command line arguments: "+args.length);
	}
}