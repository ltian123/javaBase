package day24;
import java.io.*;
public class 字符缓冲流 {
	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("d:/work/1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("d:/work/2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//每次都读取一行字符,当文件结束时，返回为null,但所读取的字符串不包含行结束符
		String data = br.readLine();
		while(data != null){
			bw.write(data);
			data = br.readLine();
			bw.newLine();
		}
		bw.flush();
		
	}
}
