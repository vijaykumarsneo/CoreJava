package Practice;
public class NestedIfLoop
{
	public static void main(String args[])
	{
		byte a = 18;
		byte b = 20;
		byte c = 12;		
		if(a>=18)
		{
			System.out.println("a is eligible to vote!");
			if(b>=20)
			{
				System.out.println("b is eligible to vote!");
				if(c>=14)
				{
					System.out.println("c is eligible to vote!");
				}
				else
					System.out.println("No, c isn't eligible to vote!");
			}
		}
	}
}