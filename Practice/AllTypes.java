package Practice;

public class AllTypes
{
	public static void main(String args[])
	{
		System.out.println("This is Vijay");
		System.out.println("S");
		StrInt();
		Int();
		Height();
		Weight();
		Char();
		Concat();
		Concat1();
	}

	public static void StrInt()
	{
		System.out.println("108");
	}
	public static void Int()
	{
		System.out.println(113);
	}
	public static void Height()
	{
		System.out.println(5.11);
	}
		
	public static void Weight()
	{
		System.out.println(80.0);
	}
		
	public static void Char()
	{
		System.out.println('&');
		System.out.println('m');
		System.out.println('M');
	}
			
	public static void Concat()
	{
		System.out.println(6 + 4);
		System.out.println("6" + 4);
		System.out.println(6 + "4");
		System.out.println(6 + "b");
		System.out.println("a" + 4);
	}
		
	public static void Concat1()
	{
		System.out.println(6 + 'b');
		System.out.println('a' + 4);
		System.out.println('a' + 'b');
		System.out.println('A');
		System.out.println('B');
		System.out.println('A' + 'B');
	}
}