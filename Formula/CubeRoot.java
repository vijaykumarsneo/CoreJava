package Formula;
import java.util.Scanner;
public class CubeRoot
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = Key.nextInt();
		int cubeRoot =(int) Math.cbrt(number);
		System.out.println("Cube of "+number+" is "+cubeRoot);
		Key.close();
	}
}