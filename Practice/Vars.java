package Practice;
public class Vars
{
	// instance vars
	byte a;			
	int b;
	short c;
	long d;	
	//static vars
	static String e;
	static char f;
	static float g;
	static double h;
	static boolean i;
	public void NonStatic()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String args[])
	{		
		//object creation
		Vars V = new Vars();	
		//method call
		V.NonStatic();
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}

/*

Ststic variables will be stored in method area.
Local variables will be stored in stack area.
Instance variables will be stored in the heap area.
JVM will not provide default values for local variables. So definitely initialize the variables before use the local variables.
Instace and static variables can be accessed by multiple threads simultaneously. And hence these variables are not thread safe. 
Incase of local variables for every thread a seperate copy will be created and hence local variables are thread safe.

*/
