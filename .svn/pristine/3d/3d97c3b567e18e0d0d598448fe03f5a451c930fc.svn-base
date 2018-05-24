package day26.线程.copy;
import java.io.*;
public class Test {
	public static void main(String[] args) throws Exception{
		File fin = new File("d:/work/t.ppt");
		//目标文件
		File fout = new File("d:/work/q.ppt");
		
		//文件长度
		long length = fin.length();
		//线程一
		RandomAccessFile rafReader1 = new RandomAccessFile(fin,"rw");
		RandomAccessFile rafWriter1 = new RandomAccessFile(fout,"rw");
		long begin1 = 0;
		long length1 = (2*length)/3;
		//线程二
		RandomAccessFile rafReader2 = new RandomAccessFile(fin,"rw");
		RandomAccessFile rafWriter2 = new RandomAccessFile(fout,"rw");
		long begin2 = length1;
		long length2 = length - length1;
		
		//启动线程
		new Thread(new Copy(begin1,length1,rafReader1,rafWriter1)).start();
		new Thread(new Copy(begin2,length2,rafReader2,rafWriter2)).start();
	}
	/*1.把指定目录中所所有文件复制到指定目录中
	 *2.编写一个函数，要求实现如下功能
	 *	String cut(String src,int len)
	 *要求截取src的gbk编码字节len个，但要求不能截取半个汉子
	 *如输入参数为:"我abc你def",len为6， 则返回“我abc”,如果len为4则返回"我ab"
	 * 提示：汉字的gbk编码第一个字节一定少于于0
	 * */
}
