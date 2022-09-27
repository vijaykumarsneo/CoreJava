//Program to print unique or distinct elements of an array.

package Arrays;

public class UniqueElements
{
	public static void main(String args[])
	{
		int[] arr = new int[] {1, 2, 3, 4, 1, 7, 8, 8, 3};
		System.out.println("Elements are: ");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nUnique elements are: ");
		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
					count++;
			}
			if(count == 1)
				System.out.print(arr[i]+" ");
		}
	}
}	