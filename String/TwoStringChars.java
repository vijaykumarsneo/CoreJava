package String;

import java.util.HashSet;

public class TwoStringChars
{
	public static void main(String[] args)
	{
		String firstString = "characters";
        String secondString = "alphabets";

        HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
        for(int i = 0; i < firstString.length(); i++)
        {
            h1.add(firstString.charAt(i));
        }
        for(int i = 0; i < secondString.length(); i++)
        {
            h2.add(secondString.charAt(i));
        }

        StringBuffer commonSB = new StringBuffer();
        StringBuffer uniqueSB = new StringBuffer();

        for(Character i : h1)
        {
            if(!h2.contains(i))
            {
               uniqueSB.append(i);
            }
            else
            {
               commonSB.append(i);
            }
        }

        for(Character i : h2)
        {
           if(!h1.contains(i))
           {
              uniqueSB.append(i);
           }
        }
        System.out.println("Common:"+commonSB.toString().replace(" ",""));
        System.out.println("Unique:"+uniqueSB.toString().replace(" ","")); 
	}
}