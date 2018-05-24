package day25;
import java.io.*;
public class 格式转换 {
	public static void main(String[] args)throws Exception {
		String src = "d:/work/1.txt";
		String dest = "d:/work/2.txt";
		//输入流
		FileInputStream fin = new FileInputStream(src);
		InputStreamReader in = new InputStreamReader(fin,"GBK");
		BufferedReader br = new BufferedReader(in);
		
		//输出流
		FileOutputStream fo = new FileOutputStream(dest);
		OutputStreamWriter out = new OutputStreamWriter(fo,"utf8");
		BufferedWriter bw = new BufferedWriter(out);
		
		String tmp = br.readLine();
		//用于统计有多少行注释
		int count = 0;
		while(tmp!=null){
			//trim()去掉字符串前后的空格，如果中间有空格不处理
			if(!tmp.trim().startsWith("//")){
				bw.write(tmp);
				bw.newLine();
			}else{
				count++;
			}
			tmp = br.readLine();
		}
		System.out.println("注释行数为："+count);
		br.close();
		bw.close();		
	}
}
