package day24.打印流;
import java.io.*;
/*1.用打印流把99乘法表写入文件，
 * 2.用字符流把该表读出并打印*/
public class Test {
	public static void main(String[] args)throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream("d:/work/1.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("d:/work/1.txt"));
		pw.print(10);
		pw.print(false);
		pw.println();
		pw.flush();
	}
	
}
