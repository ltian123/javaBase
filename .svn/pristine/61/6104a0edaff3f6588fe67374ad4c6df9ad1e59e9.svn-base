package day22.IO操作;
import java.io.*;
public class 文件流 {
	public static void main(String[] args) throws Exception{
		File file = new File("d:/work/1.txt");
		FileInputStream fis = new FileInputStream(file);
		
//		for(int i = 0;i<file.length();i++){
//			char ch = (char)fis.read();
//			System.out.print(ch);
//		}
		
		int tmp = 0;
		/*read()和read(arr)读文件时，当文件读完后，再向下读就会返回-1*/
		byte[]arr = new byte[(int)file.length()];
		int i = 0;
		while((tmp = fis.read())!=-1){
			System.out.println((char)tmp);
			arr[i++] = (byte)tmp;
		}
		System.out.println(new String(arr,"gbk"));
		
		fis.close();
	}
}
