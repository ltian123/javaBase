package day23.IO;
import java.io.*;
/*用字节流的方式实现的文件格式转换复制,从一个按gbk编码格式的文件中读出来，
 * 按utf8格式写入另一文件*/
public class Copy {
	
	public static void copy(String src,String dest)throws Exception{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		byte[]arr = new byte[fis.available()];
		fis.read(arr);
		
		String tmp = new String(arr,"gbk");
		byte[]tmpArr = tmp.getBytes("utf8");
		fos.write(tmpArr);
		
		fis.close();
		fos.close();
	}
	/*不转码的文件复制
	 * 
	 * */
	public static void copy1(String src,String dest)throws Exception{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
//		byte[]arr = new byte[4];
		int tmp;
		while((tmp = fis.read())!=-1){
			fos.write(tmp);
		}
		fis.close();
		fos.close();
	}
	
	public static void copy2(String src,String dest)throws Exception{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		
		byte[]arr = new byte[4];
		int tmp;
		while((tmp = fis.read(arr))!=-1){
			fos.write(arr,0,tmp);
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args)throws Exception {
		copy1("d:/work/1.txt","d:/work/2.txt");
	}
	
}
