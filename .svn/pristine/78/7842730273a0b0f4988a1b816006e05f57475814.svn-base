package day36;
import java.io.*;
public class Test {
	public static void main(String[] args)throws Exception {
		String src = "d:/work/1.txt";
		String dest = "d:/work/2.txt";
		write();
		transfer(src,dest);
		
	}
	
	public static void transfer(String src,String dest)throws Exception{
		FileOutputStream fos = new FileOutputStream(dest);
		FileInputStream fis = new FileInputStream(src);
		//临时变量，用来保存读取的某个字节
		int data = 0;
		/*今天\r\n\n天\r气\n真不错*/
		/*如果遇到\r则把该变量赋值为true*/
		boolean flag = false;
		byte[]arr = {'\r','\n'};
		while((data = fis.read())!=-1){
			if(data=='\r'){
				fos.write(arr);
				flag = true;
			}else if(data=='\n'){
				if(flag){
					flag = false;
				}else{
					fos.write(arr);
				}
			}else{
				fos.write(data);
				flag = false;
			}
		}
		
	}
	
	public static void write()throws Exception
	{
		String src = "d:/work/1.txt";
		FileWriter fw = new FileWriter(src);
		fw.write("今天\r\n天\r气\n真不错");
		fw.close();
	}
}
