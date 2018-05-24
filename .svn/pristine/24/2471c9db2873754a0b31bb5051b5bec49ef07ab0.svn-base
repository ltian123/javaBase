package day25;
import java.io.*;
/*InputStreamReader:输入字节流转输入字符流
 *OutputStreamWriter:输出字节流转输出字符流
 *没有把字符流转字节流的类  
 * */
public class 转换流 {
	public static void main(String[] args) throws Exception{
		read();
//		write();
	}
	static void read()throws Exception
	{
		InputStream is = new FileInputStream("d:/work/1.txt");
		//转为字符输入流
		/*如果文件为gbk格式，则转换流只能用gbk格式转换为字符流*/
		InputStreamReader isr = new InputStreamReader(is,"gbk");
		int data = isr.read();
		while(data!=-1){
			System.out.print((char)data);
			data = isr.read();
		}
		isr.close();
		
	}
	static void write()throws Exception
	{
		OutputStreamWriter osw = new OutputStreamWriter
				(new FileOutputStream("d:/work/1.txt"),"utf8");
		osw.write("宝宝好可怜");
		osw.flush();
		osw.close();
		System.out.println("成功");
	}
	/*按GBK格式读取一个文件，以utf8格式写入另一个文件，以"//"开头的行不写入，最后还要统计出有多少
	 *"//"开头的行数*/
}
