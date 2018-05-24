package day23.IO.缓冲流;
import java.io.*;
/*缓冲流可以提高读写的效率，用来解决内在与外部设备之间速度不匹配的问题
 * 
 * */
public class Test {
	public static void main(String[] args)throws Exception {
		read();
	}
	public static void write()throws Exception
	{
		FileOutputStream fos = new FileOutputStream("d:/work/1.txt");		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(98);
		bos.close();
	}
	
	public static void read()throws Exception
	{
		FileInputStream fis = new FileInputStream("d:/work/1.txt");		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[]buf = new byte[100];
		int len = bis.read(buf);
		System.out.println(new String(buf,0,len));
		
		bis.close();
	}
}

/*
 * 1.分别用缓冲流和非缓冲流实现文件复制，并把源文件中的大小写互换 
 * 2.用File知识点中的递归实现一个功能：给定一个目录，要求能删除该目录中所有的空文件夹
 * 	如果删除一个空目录后，父目录为空，则继续删除父目录
 * */
