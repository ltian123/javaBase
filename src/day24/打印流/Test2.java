package day24.打印流;
import java.io.*;
public class Test2 {
	public static void main(String[] args)throws Exception {
		String src = "d:/work/1.txt";
		write(src);
		read(src);
	}
	static void write(String src)throws Exception
	{
		FileWriter out1 = new FileWriter(src);
		//第二个参数是自动刷新缓冲区作用
		PrintWriter out = new PrintWriter(out1,true);
//		PrintWriter out = new PrintWriter(src,true);
		
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				out.print(i+"*"+j+"="+i*j+"\t");
			}
			out.println();
		}
		out.close();
	}
	
	static void read(String src)throws Exception
	{
		BufferedReader in = new BufferedReader(new FileReader(src));
		while(true){
			String s = in.readLine();
			if(s==null){
				break;
			}
			System.out.println(s);
		}
		in.close();
	}
}
