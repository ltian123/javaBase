package day22.递归显示所有文件;
import java.io.*;
public class Test {
	public static void main(String[] args) {
		File f = new File("d:/work");
		method(f);
	}
	public static void method(File f){
		if(f==null){
			return;
		}
		if(f.isDirectory()){
			File []arr = f.listFiles();
			for(int i = 0;i<arr.length;i++){
				method(arr[i]);
			}
		}else{
			System.out.println(f);
		}
	}
}
