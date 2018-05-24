package day25;
import java.io.*;
public class DeleteEmptyDir {
	public static void main(String[] args) {
		File file = new File("d:\\work");
		deleteAllEmptyDir(file);
		
	}
	public static void deleteAllEmptyDir(File f){
		if(f==null){
			return;
		}
		//判断是文件还是文件夹，同时判断是否为空文件夹
		if(f.isDirectory()&&f.listFiles().length!=0){
			//得到当前目录中所有的文件和文件夹
			File[]fs = f.listFiles();
			for(File ff:fs){
				deleteAllEmptyDir(ff);
			}
		}else if(f.isDirectory()){//说明是个目录，而且空
			System.out.println("删除"+f);
			f.delete();
			//删掉当前空文件夹后，可能父目录也会由不空变为空
			deleteAllEmptyDir(f.getParentFile());
		}
	}
}
