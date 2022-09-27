package Practice;
public class ArrayLoops
{
	public static void main(String args[])
	{
		int[] number = {1,2,3,4,7,8,9,10,11,12,16,19,21};
		System.out.print("Given Numbers in the array: ");
		for(int i=0; i<number.length; i++)
		{
			System.out.print(number[i]+" ");
		}
		int i = number.length-1;
		System.out.println("");
		System.out.print("Reverse order of the numbers: ");
		while(i>=0)
		{
			System.out.print(number[i]+" ");
			i--;
		}
		System.out.println("");
		System.out.print("Even numbers in the array: ");
		i = 0;
		do
		{
			if(number[i]%2==0)
				System.out.print(number[i]+" ");
			i++;
		}while(i<number.length);
	}
}