package day23.计算器;
import java.io.*;
public class Write {
	public static void main(String[] args)throws Exception {
//		FileOutputStream fos = new FileOutputStream("d:/work/1.txt");
		FileOutputStream fos = new FileOutputStream("d:/work/1.txt",true);
		fos.write(97);
		fos.write("哈哈".getBytes("utf8"));
		
		fos.close();
		
		read();
	}
	
	public static void read()throws Exception
	{
		FileInputStream fis = new FileInputStream("d:/work/1.txt");
//		int data;
//		while((data = fis.read())!=-1){
//			System.out.println((char)data);
//		}
		
		byte[]arr = new byte[fis.available()];
		fis.read(arr);
		System.out.println(new String(arr,"gbk"));
		fis.close();
	}
}
