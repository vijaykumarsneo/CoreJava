package String;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) 
	{
		String s = "Welcome to Java";
		StringBuffer b = new StringBuffer();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character c: s.toCharArray())
		{
			int count = (charMap.containsKey(c))? charMap.get(c): 0;
			if(count!=0)
			{
				charMap.put(c, ++count);
			}
			else if(count == 0)
			{
				charMap.put(c, 1);
				b.append(c);
			}
		}
		for(char c : b.toString().toCharArray())
			System.out.println(c + " Count = " +charMap.get(c));
	}

}