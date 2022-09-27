package Practice;
public class MStesting
{	
	static void method1(String a)
	{
		System.out.println("Name   :"+a);
	}
	static int method2(int b)								//boolean char byte short int long float double
	{
		return b;
	}
	static void method3(char c)
	{
		System.out.println("Gender :"+c);
	}
	static void method4(long d)		//long num = 8099404044L;
	{
		System.out.println("Mobile :"+d);
	}
	static void method5(float e)		//float f = 234.5f;
	{
		System.out.println("Height :"+e);
	}
	static void method6(double f)		//double weight = 60.25d;
	{
		System.out.println("Weight :"+f);
	}
	
	public static void main(String args[])
	{
		int age = method2(28);						//static method call in same class 
		short salary = 30000;
		String job = "Programmer";
		boolean documents = true;
		
		System.out.println("");
		System.out.println("MyProfile");
		System.out.println("---------");
		method1("Vijay");							//static method call in same class
		System.out.println("Age    :"+age);
		method3('M');
		System.out.println("Docs   :"+documents);
		System.out.println("Job    :"+job);
		System.out.println("Salary :"+salary);
		method4(8099404044L);
		method5(5.11f);
		method6(86.0d);
		System.out.println("---------");
		System.out.println("Thankyou!");
	}
}