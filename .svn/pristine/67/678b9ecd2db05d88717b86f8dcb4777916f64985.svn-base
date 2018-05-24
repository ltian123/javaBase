package day26.线程.copy;
import java.io.*;
public class Copy implements Runnable{
	
	long begin;
	long length;
	RandomAccessFile rafReader;
	RandomAccessFile rafWriter;
	
	public Copy(long begin,long length,RandomAccessFile rafReader,RandomAccessFile rafWriter){
		this.begin = begin;
		this.length = length;
		this.rafReader = rafReader;
		this.rafWriter = rafWriter;
	}
	public void run()
	{
		try {
			rafReader.seek(begin);
			rafWriter.seek(begin);
			
			int tmp;
			for(int i = 0;i<length;i++){
				tmp = rafReader.read();
				rafWriter.write(tmp);
			}
			System.out.println(Thread.currentThread().getName()+"完成！");
			rafReader.close();
			rafWriter.close();
		} catch (IOException e) {
			
		}
	}
}
