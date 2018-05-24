package day22.递归显示所有文件;
import java.io.*;
public class FilterTest implements FilenameFilter{
	
	public boolean accept(File dir, String name){
		if(name.endsWith(".jpg")||name.endsWith(".png")||name.endsWith(".java")){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		File f = new File("d:/work");
		String[]arr = f.list(new FilterTest());
		
		for(String tmp:arr){
			System.out.println(tmp);
		}
	}
}
