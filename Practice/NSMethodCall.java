package Practice;
public class NSMethodCall
{
	byte a;
	int b;
	short c;
	long d;
	boolean e;
	float f;
	double g;
	char h;
	String i;
	public void Default()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
	public static void main(String args[])
	{	
		NSMethodCall value = new NSMethodCall();
		value.Default();
	}
}