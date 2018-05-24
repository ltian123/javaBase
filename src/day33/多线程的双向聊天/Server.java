package day33.多线程的双向聊天;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(4000);
		while (true) {
			Socket socket = ss.accept();
			new ServerIn(socket).start();
			new ServerOut(socket).start();
		}
	}
}

// 下面线程只处理客户发来的的信息
class ServerIn extends Thread {
	Socket socket;

	public ServerIn(Socket s) {
		socket = s;
	}

	public void run() {
		try {
			InputStream is = socket.getInputStream();
			byte[] buffer = new byte[1024];
			while (true) {
				int length = is.read(buffer);
				if (length <= 0) {
					continue;
				}
				String msg = new String(buffer, 0, length);
				System.out.println("服务器收到数据：" + msg);
				if (msg.equals("quit")) {
					break;
				}
				
			}
		} catch (IOException e) {

		}
	}
}

class ServerOut extends Thread {
	Socket socket;

	public ServerOut(Socket s) {
		socket = s;
	}

	public void run() {
		try {
			OutputStream os = socket.getOutputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("服务器等待输入：");
			os.write(reader.readLine().getBytes());

		} catch (IOException e) {

		}
	}
}