package Practice;
public class MethodsFlow
{
	public static void main (String []args)
	{
		System.out.println("Hi! This is ");
		method1("Vijay");
	}
	
	public static void method1 (String Firstname)
	{
		System.out.println(Firstname);
		method2(" Kumar");
	}
	
	public static void method2 (String Middlename)
	{
		System.out.println(Middlename);
		method3(" Samudrala");
	}
	
	public static void method3 (String Lastname)
	{
		System.out.println(Lastname);
		System.out.println("Bye!");
	}
}