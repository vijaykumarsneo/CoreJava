package Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCharCount 
{
   public static void main(String args[]) throws IOException
   {

      int charCount =0;
      File file = new File("Vijay.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      for(int i = 0; i< s.length(); i++)
      {
      	if(s.charAt(i) != ' ')
      	{
      		charCount++;
      	}
      }
      System.out.println("Number of words in the given file are " +charCount);
      fis.close();
   }
}