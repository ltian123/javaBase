package day23.IO;
import java.io.*;
public class 标准输入输出流 {
	public static void main(String[] args)throws Exception {

		write();
	}
	public static void read()throws Exception
	{
		
		FileInputStream fis = new FileInputStream("d:/work/1.txt");
		/*标准输入流的重定向*/
		System.setIn(fis);
		
		System.out.println(System.in==fis);
		int tmp;
		while((tmp=System.in.read())!=-1){
			System.out.print((char)tmp);
		}
		
	}
	public static void write()throws Exception
	{
		OutputStream os = System.out;
		PrintStream ps = new PrintStream("d:/work/1.txt");
		//标准输出流的重定向
		System.setOut(ps);
		ps.write(97);
		System.out.write(98);
		
		ps.print("哈哈");
		System.out.println("嘿嘿");
		System.out.println("fdjoil;afjil;aflkds;fjlkds");
		ps.close();
	}
}
