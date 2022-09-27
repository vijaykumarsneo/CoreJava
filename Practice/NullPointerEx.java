package Practice;
public class NullPointerEx
{
	public static void main(String args[])
	{
		String name = "";
		try
		{
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Assign atlest one letter in the string variable");
		}
		System.out.println("Test from NullPointerEx");
	}
}