package Practice;
public class HaloWorld
{
	public static void main(String args[])
	{
		int hour = 11;
		int minute = 59;
		String greeting = "Hello!"; 
		String message = greeting + " Mr.Robot"; 
		
		System.out.println("Hello " + "World"); //Hello World
		
		System.out.println("Hi" + 1 + 2); //Hi12
		
		System.out.println(1 + 2 + "Hi"); //3Hi
		
		System.out.println(hour * minute/60); //10
		
		System.out.println((hour * minute)/60); //10
		
		System.out.println(hour + minute); //70
		
		System.out.println("hour + minute");//hour + minute
		
		System.out.println("hour" + "minute");//hourminute
		
		System.out.println(message); // Hello Mr.Robot
		
		System.out.println('a' + 'b' + 'c'); // total
		
		System.out.println("a" + 'b' + 'c'); //abc
		
		System.out.println('a' + 'b' + "c");//195c
		
		System.out.println("My Name is Vijay!"); 
		
		System.out.println("Welcome to JAVA Programming!!"); 	
		
		System.out.println(hour++);		//11
		
		System.out.println(++hour);		//13
		
		System.out.println(minute--);	//59
		
		System.out.println(--minute);	//57
	}
} 

/***********************************************************
Three major steps:

1. Composing Java Source Code

a). Open a new file
b). Write the below code into the file
c). Save the file as .java extension
Ex: HaloWorld.java

2. Compile the Java Source Code

a). Open CMD prompt
b). Change to the location to compile the java source code
Ex: javac filename
	javac HaloWorld.java
	
3. Execution of the Java Program
a). Run the java command with classname
Ex: java classname
	java HaloWorld
*************************************************************/
