package String;
public class StringEx
{
	public static void main(String args[])
	{
		String name = "";
		try
		{
			System.out.println(name.charAt(0));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Assign atlest one letter in the string variable");
		}
		System.out.println("Test from StringEx");
	}
}