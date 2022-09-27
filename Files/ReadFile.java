package Files;
import java.io.*;

public class ReadFile
{
	public static void main(String args[]) throws IOException
	{
		File file = new File("SV.txt");
		FileReader reader = new FileReader(file);
		int content = 0;
		while((content = reader.read())!= -1)
		{
			System.out.print((char)content);
		}
		reader.close();
	}
}