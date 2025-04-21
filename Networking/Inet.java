import java.net.*;
class Inet 
{
	public static void main(String a[])
	{
		try
		{
			InetAddress i=InetAddress.getByName("www.facebook.com");
			System.out.println("Host Name is:="+i.getHostName());
			System.out.println("Host Address:="+i.getHostAddress());
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}

}