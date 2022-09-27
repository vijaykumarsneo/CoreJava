package Arrays;

import java.util.Scanner;
public class EvenCubeArray
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = input.nextInt();
		int[] number = new int[size]; 	//declaration and instantiation
		System.out.println("Enter "+number.length +" elements of the array");
		for(int i = 0; i < number.length; i++)
		{
			number[i]=input.nextInt();
		}
		System.out.println("Cubes of even numbers of the array: ");
		for(int i = 0; i < number.length; i++)
		{
			if(number[i]%2==0)
			{
				System.out.print((int)Math.pow(number[i],3)+" ");
			}
		}
		input.close();
	}
}