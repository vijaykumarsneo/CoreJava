//Program to print duplicate elements of an array.

package Arrays;

public class DuplicateElements
{
	public static void main(String args[])
	{
		int[] arr = new int[] {1, 2, 3, 4, 1, 7, 8, 8, 3};
		System.out.println("Duplicate elements are: ");
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}	