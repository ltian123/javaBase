package day24;
import java.io.*;
public class 随机流 {
	public static void main(String[] args)throws Exception {
//		read();
		RandomAccessFile raf = new RandomAccessFile("d:/work/1.txt","rw");
		operBasic(raf);
		
	
	}
	static void write()throws Exception{
		RandomAccessFile raf = new RandomAccessFile("d:/work/1.txt","rw");
		//用下面方法 可追加数据
		raf.seek(raf.length());
		raf.write(98);
		raf.writeBytes("hello world");
		//相对于文件的第0个位置移动
		raf.seek(0);
		//相对于当前位置向后移动7个字节
		raf.skipBytes(7);
		raf.write('a');
		
		System.out.println("当前指针位置："+raf.getFilePointer());
		raf.close();
	}
	static void read()throws Exception{
		RandomAccessFile raf = new RandomAccessFile("d:/work/1.txt","r");
		raf.skipBytes(3);
		byte[]buffer = new byte[3];
		int num = raf.read(buffer);
		System.out.println(new String(buffer,0,num));
	}
	
	static void operBasic(RandomAccessFile raf) throws IOException{
		boolean bool = false;
		int age = 20;
		double money = 10.2;
		String str = "大中国";
		raf.writeBoolean(bool);
		raf.writeInt(age);
		raf.writeDouble(money);
		raf.writeUTF(str);
		raf.seek(0);
		System.out.println(raf.readBoolean());
		System.out.println(raf.readInt());
	}
}
