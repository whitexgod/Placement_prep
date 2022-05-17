import java.io.*;
import java.net.*;
 
class ClientUdp
{
	public static void main(String a[]) throws IOException
	{
		DatagramSocket ds = new DatagramSocket(5060);
		byte msg[] = a[0].getBytes();
		InetAddress in = InetAddress.getByName("Red-Dragon");
		System.out.println(in);
		DatagramPacket dp = new DatagramPacket(msg,msg.length,in,5550);
		ds.send(dp);
	}
 
}