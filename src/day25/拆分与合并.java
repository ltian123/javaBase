package day25;

/*1.编写函数实现拆分文件功能，要求如下：
 splitFile(String path,int len);
 此处的path是要拆分的文件，len表示要把该文件按多大字节进行拆分成一系列小文件
 要求把这些小文件放在源文件所在的目录中，并删除源文件，小文件名1.part,2.part,....

 2.合并文件，mergeFile(String path);
 合并完成后要求删除小文件*/
import java.io.*;

public class 拆分与合并 {
	public static void main(String[] args)throws IOException {
//		splitFile("d:/work/t.ppt",1024*1024);
		mergeFile("d:/work");
	}

	
	/* 拆分文件，一个输入流，多个输出流 */
	public static void splitFile(String src, int len) throws IOException {
		File f = new File(src);
		if (!f.exists()) {
			return;
		}

		FileInputStream fis = new FileInputStream(f);

		FileOutputStream fos = null;
		byte[]buffer = new byte[len];
		int count = 0;
		int num = 0;
		while((count=fis.read(buffer))!=-1){
			fos = new FileOutputStream(f.getParent()+"/"+(++num)+".part");
			fos.write(buffer,0,count);
			fos.close();
		}
		fis.close();
		f.delete();
		System.out.println("拆分完成,共拆分了"+num+"个");

	}
	public static void mergeFile(String dest)throws IOException
	{
		FileOutputStream fos = new FileOutputStream(dest+"/t.ppt");
		FileInputStream fis = null;
		File f = new File(dest);
		long len = f.list().length;
		/*每循环一次读取一个小文件结束*/
		for(int i = 1;i<=len;i++){
			File tmp = new File(dest+"/"+i+".part");
			if(!tmp.exists()){
				break;
			}
			fis = new FileInputStream(tmp);
			byte[]buffer = new byte[64];
			int count;
			
			while((count = fis.read(buffer))!=-1){
				fos.write(buffer,0,count);
			}
			//小文件读取结束
			fis.close();
			tmp.delete();
		}
		System.out.println("合并完成");
		fos.close();
	}
}
