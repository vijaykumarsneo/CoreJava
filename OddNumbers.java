import java.util.Scanner;

public class OddNumbers
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = Key.nextInt();
		System.out.println("Odd numbers upto "+number+" are :");
		for(int i = 0; i<= number; i++)
		{
			if(i % 2 == 1)
			{
				System.out.print(i+"|");
			}
		}
		Key.close();
	}
}