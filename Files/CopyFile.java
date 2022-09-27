package Files;

import java.io.*;

public class CopyFile 
{
	public static void main(String[] args) throws IOException
	{
		byte[] data = new byte[45];
		
		FileInputStream input = new FileInputStream("Vijay.txt");
		FileOutputStream output = new FileOutputStream("VJ.txt");
		input.read(data);
		output.write(data);
		input.close();
		output.close();
	}
}
