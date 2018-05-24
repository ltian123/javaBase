package day23.IO.字节数组流;
import java.io.*;
public class Test {
	public static void main(String[] args)throws Exception {
//		read();
		write();
	}
	//字节数组输入流
	public static void read()
	{
		byte[]data = "welcom to Nanjing".getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		
		int tmp = 0;
		while((tmp = bais.read())!=-1){
			System.out.print((char)tmp);
		}
	}
	
	//字节数组输出流
	public static void write()throws Exception
	{
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		baos.write(97);
		baos.write("hello".getBytes());
		
		baos.flush();
		byte[]data = baos.toByteArray();
		System.out.println(new String(data));
	}
}
