package Practice;
public class Calculator
{
	public static void add(int a, int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	public static void sub(int a, int b)
	{
		System.out.println("Substraction :"+(a-b));
	}
	public static void mul(int a, int b)
	{
		System.out.println("Multiplication :"+(a*b));
	}
	public static void dev(int a, int b)
	{
		System.out.println("Devision :"+(a/b));
	}
	public static void mod(int a, int b)
	{
		System.out.println("Remainder :"+(a%b));
	}
	
	public static void main(String args[])
	{
		add(5,6);
		sub(6,4);
		mul(4,3);
		dev(10,5);
		mod(9,4);
	}
}