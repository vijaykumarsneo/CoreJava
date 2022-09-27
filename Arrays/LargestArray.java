package Arrays;

import java.util.Scanner;
public class LargestArray
{
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = Key.nextInt();
		int[] numArray = new int[size];
		System.out.println("Enter "+numArray.length +" elements of the array");
		for(int i = 0; i < numArray.length; i++)
		{
			numArray[i]=Key.nextInt();
		}
		int largest = numArray[0];
		for(int num : numArray)
		{
			if(largest < num)
				largest = num;
		}
		System.out.println("Largest number in the array: "+ largest);
		Key.close();
	}
}