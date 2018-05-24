package day24;
import java.io.*;
public class 字符数组流 {
	public static void main(String[] args)throws Exception {
		char []arr = write();
		read(arr);
	}
	
	static char[] write()throws Exception
	{
		CharArrayWriter writer = new CharArrayWriter();
		writer.write("哈哈hhhh");		
//		System.out.println(writer);
		return writer.toCharArray();
	}
	
	static void read(char[]arr)throws Exception
	{
		CharArrayReader reader = new CharArrayReader(arr);
		char[]tmp = new char[1];
		int len = 0;
		while((len = reader.read(tmp))!=-1){
			System.out.println(new String(tmp,0,len));
		}
	}
}
