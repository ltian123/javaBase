package day22;
import java.io.*;
/*给定一个目录，要求打印出该目录下所有的子文件夹名称*/
public class 练习 {
	public static void main(String[] args) {
		String path = "d:/work";
		File dir = new File(path);
		
		File[]arr = dir.listFiles();
		
		for(File tmp:arr){
			if(tmp.isDirectory()){
				System.out.println(tmp.getName());
			}
		}
	}
}
