package day22;
import java.io.*;
public class Test1 {
	/*用一个大数组把文件一次性读完*/
	public static void test(String[] args) {
		FileInputStream fis = null;
		try {
//			File f = new File("d:/work/1.txt");
			fis = new FileInputStream("d:/work/1.txt");
//			byte[]buffer = new byte[(int)f.length()];
			byte[]buffer = new byte[fis.available()];
			int len = fis.read(buffer);
			
			System.out.println(len);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:/work/1.txt");
		byte[]buffer = new byte[64];
		int len = 0;
		while((len = fis.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}
		
		fis.close();
	}
	
}
