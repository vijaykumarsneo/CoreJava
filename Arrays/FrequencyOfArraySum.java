package Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyOfArraySum {
	public static int elementFrequency(int N, int M, int A[]) {
		Map<Integer, Integer> mp = new HashMap<>();
		int result = 0, value = 0;
	      for (int i = 0; i < N; i++)
	      {
	         if (mp.containsKey(A[i]))
	         {
	           mp.put(A[i], mp.get(A[i]) + 1);
	         }
	         else
	         {
	           mp.put(A[i], 1);
	         }
	     }
	     for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	          System.out.println("Frequency of element "+entry.getKey()+" is "+entry.getValue());
	     for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	     {
	    	 
	    	 if(entry.getValue()<= M)
	    	 {	
	    		 value = M-entry.getValue();
	    		 System.out.println("Frequencies less than M: "+M + " - "+entry.getValue()+" = "+value);
				 result = result + (value);
	    	 }
	     }
	    System.out.print("Sum of frequencies of elements count = ");
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int N = sc.nextInt();
		System.out.print("Enter frequency value of an array: ");
		int M = sc.nextInt();
		int A[] = new int[N];
		System.out.print("Enter "+N +" elements of the array: ");
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		System.out.println(elementFrequency(N, M, A));
		sc.close();
	}
}