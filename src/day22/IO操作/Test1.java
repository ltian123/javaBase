package day22.IO操作;
import java.io.*;
/*read():读取一个字节，并返回该字节
 *read(arr):读取n([文件长度，数组长度]之间的最小值)个字节，
 *把这n个字节存在放arr字节数组中，并返回本次一共读取了多少字节n 
 * */
import java.util.*;

public class Test1 {
	public static void test(String[] args)throws Exception {
		InputStream is = System.in;
		System.out.println("请输入数据:");
		int data = is.read();
		int data2 = is.read();
		int data3 = is.read();
		byte[]arr = {(byte)data,(byte)data2,(byte)data3};

		System.out.println(new String(arr,"utf8"));
		
		is.close();
	}
	
	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		System.out.println("请输入数据:");
		byte[]arr = new byte[1000];
		Arrays.fill(arr, (byte)100);
		int len = is.read(arr);
		
		String dest = new String(arr,0,len,"utf8");
		System.out.println(dest);
	}
}
