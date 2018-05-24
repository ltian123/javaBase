package day21.File使用;
import java.io.*;
import java.util.*;
public class Test1 {
	public static void test(String[] args)throws IOException {
		/*第一种：*/
		//用相对路径产生的文件对象
		File f1 = new File("work/1.txt");
		//绝对路径
		File f2 = new File("d:/work/1.txt");
		
		/*第二种*/
		File f3 = new File("d:/work","1.txt");
		
		/*第三种*/
		File parent = new File("d:/work");
		File f4 = new File(parent,"1.txt");
		
		System.out.println("文件名："+f1.getName());
		/*如果文件对象是用相对路径得出，则此时显示的是相对路径*/
		System.out.println("路径："+f1.getPath());
		/*得到文件的绝对路径*/
		System.out.println("路径:"+f1.getAbsolutePath());
		System.out.println("父目录："+f4.getParent());
		System.out.println("父目录的文件对象："+f4.getParentFile());
		
		System.out.println("文件有多大："+f3.length());
		System.out.println("是否可读："+f3.canRead());
		System.out.println("文件是否存在？"+f4.exists());
		
		System.out.println("删除文件："+f4.delete());
		//创建目录
		File f5 = new File("d:/work/create/www");
		//如果父目录不存在，则创建目录不成功
//		f5.mkdir();
		//会创建多级目录
		f5.mkdirs();
		
		File f6 = new File("d:/work/2.txt");
		
		f6.createNewFile();
		//判断某个文件对象是否为目录
		f6.isDirectory();
		//判断是否为文件
		f6.isFile();
		f6.isHidden();
		
	}
	
	public static void main(String[] args) {
		File f = new File("d:/work");
		//获取当前目录下的所有文件名
		String[]names = f.list();
		
		System.out.println("当前目录下所有文件名称为：");
		System.out.println(Arrays.toString(names));
		//获取该目录下所有的文件对象
		File[]files = f.listFiles();
		System.out.println(Arrays.toString(files));
		
		for(int i = 0;i<files.length;i++){
			System.out.println(files[i].getName()+"长度为："+files[i].length());
		}		
	}
}
