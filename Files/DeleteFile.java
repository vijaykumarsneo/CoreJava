package Files;
import java.io.*;

public class DeleteFile
{
	private static boolean deleteFile(String filename) 
	{
		boolean exists = new File(filename).delete();
		return exists;
	}
	
	private static void test(String type, String filename) 
	{
		System.out.println("The following "+type+" called "+filename+(deleteFile(filename)?" was deleted.":"does not exist."));
	}
	
	public static void main(String[] args)
	{
		test("file","SV.txt");
	}
}