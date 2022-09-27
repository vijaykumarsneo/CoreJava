package Arrays;

public class CommonElements {

	public static void main(String[] args)
	{
		int[] arr1 = new int[] {1, 3, 7, 8};		//declare and initialization
		int[] arr2 = new int[] {9, 5, 7, 2, 1, 4, 8}; 
		System.out.println("Common elements of are: ");
		for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}	
}