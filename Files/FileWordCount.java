package Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Sample 
{
   public static void main(String args[]) throws IOException
   {

      int count =0;
      File file = new File("Vijay.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      String [] data = s.split(" ");
      for (int i=0; i<data.length; i++) 
      {
         count++;
      }
      System.out.println("Number of words in the given file are " +count);
      fis.close();
   }
}