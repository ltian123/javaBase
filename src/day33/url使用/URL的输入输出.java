package day33.url使用;
import java.net.*;
import java.io.*;
public class URL的输入输出 {
	public static void main(String[] args)throws Exception {
		URL url = new URL("ftp://teacher:itany123@172.16.1.11/wbs16072/1.txt");
		URLConnection con = url.openConnection();
		//输入流
//		InputStream is = con.getInputStream();
		OutputStream os = con.getOutputStream();
		//转成字符流
		//加缓冲流
		
	}
}
