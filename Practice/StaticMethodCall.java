package Practice;
public class StaticMethodCall
{
	public static void main (String []args)
	{
		method1();
		method2();
		method3();
	}
	
	public static void method1 ()
	{
		System.out.println("method1 called by main method");
	}
	
	public static void method2 ()
	{
		System.out.println("method2 called by main method");
	}
	
	public static void method3 ()
	{
		System.out.println("method3 called by main method");
	}
}

/*
If we are writing more than one methods in a class then it should unique signature. Two methods will not have same signature.

class variable ==> static variable ==> classname.variablename;

class methods ==> static methods ==> classname.methodname;

class variable ==> non-static ==> objectname.variablename;

class methods ==> non-static ==> objectname.methodname;

*/
