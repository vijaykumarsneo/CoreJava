package Practice;
public class MethodOverloading
{
	public static void main(String args[])
	{
		int x=add(12,25,23,26,24);
		System.out.println(x);
  
		double y=add(1.0,2.0,3.0,4.0,5.0);
		System.out.println(y); 
	}
	static int add(int a, int b)
	{
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d)
	{
		System.out.println("This is overloaded method #3");
		return a+b+c+d;
	}
	static int add(int a, int b, int c, int d, int e)
	{
		System.out.println("This is overloaded method #4");
		return a+b+c+d+e;
	}
	static double add(double a, double b)
	{
		System.out.println("This is overloaded method #5");
		return a+b;
	}
	static double add(double a, double b, double c)
	{
		System.out.println("This is overloaded method #6");
		return a+b+c;
	}
	static double add(double a, double b, double c, double d)
	{
		System.out.println("This is overloaded method #7");
		return a+b+c+d;
	}
	static double add(double a, double b, double c, double d, double e)
	{
		System.out.println("This is overloaded method #8");
		return a+b+c+d+e;
	}
}