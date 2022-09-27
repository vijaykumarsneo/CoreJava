package String;

import java.util.Scanner;
public class StringCount
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Write a sentence: ");
		String line = Key.nextLine(); 
		String word[] = line.split(" ");
		System.out.println("Number of letters and spaces in the sentence: " +line.length());
		System.out.println("Number of words in the sentence: "+word.length);
		System.out.println("Upper case of the sentence: "+line.toUpperCase());
		System.out.println("Lower case of the sentence: "+line.toLowerCase());
		System.out.print("Reverse of the sentence: ");
		for(int i = line.length()-1; i>=0; i--)
		{
			System.out.print(line.charAt(i));
		}
		System.out.println("");
		System.out.print("Words reverse of the sentence: ");
		for(int i = word.length-1; i>=0; i--)
		{
			System.out.print(word[i]+" ");
		}
		System.out.println("");
		System.out.print("Enter a word that is found in the above line or not: ");
		String wordOne = Key.next();
		boolean isFound = line.contains(wordOne);
		if(isFound)
		{
			System.out.println("contains() ==> "+isFound);
		}
		else
		{
			System.out.println("contains() ==> "+isFound);
		}
		System.out.print("The position of the "+wordOne+" is "); 
		System.out.println("indexOf() ==> "+line.indexOf(wordOne));
		System.out.print("Enter a word to concat the above sentence: ");
		System.out.println("concat() ==> "+line.concat(Key.next()));
		System.out.println("substring() ==> "+line.substring(0,line.indexOf(wordOne)));
		System.out.println("trim() ==> "+line.trim());
		//System.out.println(line.substring(0,line.indexOf(wordOne)).trim());
		System.out.println("Enter two words to check those are equal or not:");
		String wordTwo = Key.next();
		String wordThree = Key.next();
		if(wordTwo.equals(wordThree))
		{
			System.out.println(wordTwo+" & "+wordThree+" are equal");
		}
		else 
		{
			System.out.println(wordTwo+" & "+wordThree+" are not equal");
		}
		//System.out.println("equals() ==> "+wordTwo.equals(wordThree));
		System.out.println("equalsIgnoreCase() ==> "+wordTwo.equalsIgnoreCase(wordThree));
		System.out.println("replace() ==> "+line.replace(wordTwo,wordThree));
		char nameArray[] = wordTwo.toCharArray();
		System.out.println("Third posision of "+wordTwo+" is "+nameArray[2]);
		System.out.println("isEmpty() ==> "+line.isEmpty());
		Key.close();
	}
}