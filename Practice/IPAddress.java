//Find IP Address of Machine
package Practice;
import java.net.*;

public class IPAddress
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ipAddr = InetAddress.getLocalHost();
			System.out.println("IP address of the machine: "+ipAddr.getHostAddress());
		}
		catch(UnknownHostException ex)
		{
			ex.printStackTrace();
		}
	}
}