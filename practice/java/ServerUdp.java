import java.io.*;
import java.net.*;
 
class ServerUdp
{
	public static void main(String args[])throws IOException
	{
		try
		{
			System.out.println("Server is Ready...");
			DatagramSocket ds = new DatagramSocket(5550);
			while(true)
				{
					byte msg[] = new byte[1024];
					DatagramPacket dp = new DatagramPacket(msg,1024);
					ds.receive(dp);
					String s = new String(msg).trim();
                    try
                    {
                        int num = Integer.parseInt(s);
                        if (num%2==0)
                        {
                            System.out.println("Even");
                        }
                        else
                        {
                            System.out.println("Odd");
                        }
                    }
                    catch(Exception e)
                    {
                        
                    }
					
					if(s.equals("bye") || s.equals("Bye") || s.equals("BYE"))
						break;
				}
		}
		catch(IOException e)
		{
			System.out.println("Exception!\n"+e);
		}		
	}
}
 