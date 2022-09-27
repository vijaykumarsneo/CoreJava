package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteFile
{
	public static void main(String args[]) throws IOException
	{
		File firstFile = null;
		firstFile = new File("Kumar.txt");
		firstFile.createNewFile();
		FileWriter Wr = new FileWriter(firstFile);
		Wr.write("Welcome to Java Programming!!. It is one of the best OOPs. It is robust");
		Wr.flush();
		Wr.close();
	}
}