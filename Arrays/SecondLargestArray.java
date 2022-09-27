package Arrays;
public class SecondLargestArray
{
	public static void main(String args[])
	{
		int[] numArray = {13, 25, 34, 01, 27, 18};
		int largest = numArray[0];
		int secondLargest = numArray[1];
		for(int i =0; i < numArray.length; i++)
		{
			if(numArray[i] > largest)
			{
				secondLargest = largest;
				largest = numArray[i];
			}
			else if(numArray[i] > secondLargest)
				secondLargest = numArray[i];
		}
		System.out.println("The second largest element in the array is: "+secondLargest);
	}
}