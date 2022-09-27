package String;

import java.util.Arrays;
public class StringAnagram
{
	public static void main(String[] args)
	{
		String s1 = "eat";
		String s2 = "ate";
		char s1Array[] = s1.toCharArray();
		char s2Array[] = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		boolean status = Arrays.equals(s1Array,s2Array);
		if(status)
			System.out.println(s1+" & " +s2+" is Anagram");
		else
			System.out.println(s1+" & " +s2+" is not Anagram");
	}
}