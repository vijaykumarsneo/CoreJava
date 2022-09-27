package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateLoopWriteFile 
{
	public static void main(String[] args) throws IOException
	{
		File thirdFile = null;
		thirdFile = new File("VijayKumar.txt");
		thirdFile.createNewFile();
		FileWriter Code = new FileWriter(thirdFile);
		for(int i=1; i<=100; i++) 
		{
			Code.write("Welcome to Java Programming!!");
			Code.write("\n");
		}
		Code.flush();
		Code.close();
	}
}