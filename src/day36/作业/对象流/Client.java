package day36.作业.对象流;
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args)throws Exception {
		Socket so = new Socket("192.168.17.120",9999);
		System.out.println("已经连接上服务器...");
		InputStream in = so.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		Object o = ois.readObject();
		parseMsg(o);
		Object o1 = ois.readObject();
		parseMsg(o1);
		ois.close();
		so.close();
	}
	public static void parseMsg(Object o){
		Message m = (Message)o;
		String s = m.fromWho+"对"+m.toWho+"说"+m.content;
		if(m.type==0){
			System.out.println(s+",拥抱...");
		}else if(m.type==1){
			System.out.println(s+",微笑");
		}else if(m.type==2){
			System.out.println(s+",鲜花");
		}
	}
}
