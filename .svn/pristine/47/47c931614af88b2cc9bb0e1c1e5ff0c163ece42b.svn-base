package day33.多线程的双向聊天;
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args)throws Exception {
		Socket s = new Socket("127.0.0.1",4000);
		new ClientIn(s).start();
		new ClientOut(s).start();
	}
}
class ClientIn extends Thread {
	Socket socket;

	public ClientIn(Socket s) {
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
				System.out.println("收到数据：" + msg);
				if (msg.equals("quit")) {
					break;
				}	
			}
		} catch (IOException e) {

		}
	}
}

class ClientOut extends Thread {
	Socket socket;

	public ClientOut(Socket s) {
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