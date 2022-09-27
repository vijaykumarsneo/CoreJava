package Files;

import java.io.File;
import java.io.IOException;

public class CreateEmptyFile 
{
	public static void main(String args[])throws IOException
	{
		File secondFile = null;	
		secondFile = new File("SVK.txt");
		secondFile.createNewFile();
	}
}