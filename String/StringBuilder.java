package String;
public class StringBuilder
{
	public static void main(String[] args)
	{
		Object myObject = new Object();
		//String myString = myObject.toString();
		//System.out.println(myString);
		System.out.println(myObject);
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		System.out.println(a);
		System.out.println(b);
		a = b;
		System.out.println(a);
		System.out.println(b);
	}
}