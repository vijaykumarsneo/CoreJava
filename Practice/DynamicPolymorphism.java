package Practice;
class A
{
	public void test()
	{
		System.out.println("Hello Vijay");
	}
}
	
class B extends A
{
	public void test()
	{
		System.out.println("Hello Kumar");
	}
}
	
public class DynamicPolymorphism
{	
	public static void main(String args[])
	{
		A a = new A();
		A a1 = new B();
		B b = new B();
		//B b1 = new A();		//Invalid (We cannot write like this)		
		a.test();
		a1.test();
		b.test();
	}
}