package String;

import java.util.Scanner;
public class VowelConStringCount
{
	public static void main(String args[])
	{
		Scanner Key = new Scanner(System.in);
		System.out.print("Enter a string :");
		String line = Key.nextLine();
		boolean isLowerVowel, isUpperVowel;
		boolean isLowerConsonant, isUpperConsonant;
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0; i<line.length(); i++)
		{
			char ltr = line.charAt(i);
			isLowerVowel = (ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u');
			isUpperVowel = (ltr == 'A' || ltr == 'E' || ltr == 'I' || ltr == 'O' || ltr == 'U');
			isLowerConsonant = ltr >= 'a' && ltr <= 'z';
			isUpperConsonant = ltr >= 'A' && ltr <= 'Z';
			if(isLowerVowel || isUpperVowel)
			{
				++vowelCount;
			}
			else if(isLowerConsonant || isUpperConsonant)
			{
				++consonantCount;
			}
		}
		System.out.println("Vowel Coount :"+vowelCount);
		System.out.println("Consonant Coount :"+consonantCount);
		Key.close();
	}
}