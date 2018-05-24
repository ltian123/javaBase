package day36.作业.对象流;
import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket s = new ServerSocket(9999);
		Socket so = s.accept();
		OutputStream out = so.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		Message msg = new Message();
		msg.type = 1;
		msg.fromWho = "张三";
		msg.toWho = "李四";	
		msg.content = "I love you";
		
		Message msg1 = new Message();
		msg1.type = 2;
		msg1.fromWho = "李四";
		msg1.toWho = "张三";	
		msg1.content = "I hate you";
		
		oos.writeObject(msg);
		oos.writeObject(msg1);
		oos.close();
		so.close();
		
	}
}
