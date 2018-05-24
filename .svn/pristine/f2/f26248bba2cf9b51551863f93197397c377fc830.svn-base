package day33.socket通信;
import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args)throws Exception {
		//1.创建Socket
		Socket s = new Socket(InetAddress.getLocalHost(),9999);
		//2.产生输入流
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		System.out.println("开始向服务器发消息...");
		pw.println("how are you!!!");
		pw.flush();
		
		//下面接收服务器的信息
		System.out.println("等待接收服务器的消息...");
		Thread.sleep(1000);
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("服务器说："+br.readLine());
		
		s.close();
		br.close();
		pw.close();
	}
}
