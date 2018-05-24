package day33.udp通信;
import java.net.*;
public class UdpClient {
	public static void main(String[] args)throws Exception {
		//1.定义一个邮递员
		DatagramSocket ds = new DatagramSocket();
		//2.发送信息的字节数据
		byte[]bs = "hello world!!!".getBytes();
		//3.InetAddress,说清楚向哪里发信息
		InetAddress ia = InetAddress.getLocalHost();
		//4.定义一个信封
		DatagramPacket dp = new DatagramPacket(bs,bs.length,ia,8000);
		
		//5.发送信息
		ds.send(dp);
	}
}
