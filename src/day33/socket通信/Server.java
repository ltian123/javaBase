package day33.socket通信;
import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args)throws Exception {
		//1.创建serversocket对象
		ServerSocket ss = new ServerSocket(9999);
		//2.创建一个socket,该对象中包含IP和端口号
		Socket s = null;
		System.out.println("服务器已经启动....");
		while(true){
			s = ss.accept();
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf8"));
			System.out.println("等待客户端发来信息...");
			Thread.sleep(500);
			String str = br.readLine();
			System.out.println(s.getInetAddress()+":"+str);
			
			//向客户端响应信息
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
			pw.println("品保人田志在四方");
			pw.flush();
			s.close();
			br.close();
			pw.close();
			
		}
	}
}
