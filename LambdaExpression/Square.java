package LambdaExpression;
import java.util.Scanner;
interface Interf1
{
	public int cube(int a);
}
public class Square
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = Key.nextInt();
		Interf1 cubeNumber = (a)-> a*a*a;		//Lambda Expression
		System.out.println("Cube of "+number+" is "+cubeNumber.cube(number));
		Key.close();
	}
}
