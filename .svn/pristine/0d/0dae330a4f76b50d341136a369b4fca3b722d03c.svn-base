package day24;

import java.io.*;

public class Data流的使用 {
	public static void main(String[] args) throws Exception {
		write();
	}

	public static void write() throws Exception {
		FileOutputStream fos = new FileOutputStream("d:/work/1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		byte b = 3;
		int i = 100;
		boolean bool = false;
		char c = 'k';
		float f = 3.14f;
		char c1 = '中';
		/*中:4578
		 * */
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeBoolean(bool);
		dos.writeChar(c);
		dos.writeFloat(f);
		dos.writeChar(c1);
		
		dos.flush();
		dos.close();
	}
	
	public static void read() throws Exception {
		FileInputStream fos = new FileInputStream("d:/work/1.txt");
		BufferedInputStream bos = new BufferedInputStream(fos);
		DataInputStream dos = new DataInputStream(bos);

		byte b ;
		int i ;
		boolean bool;
		char c;
		float f ;
		char c1;
		/*中:4578
		 * */
		b = dos.readByte();
		i = dos.readInt();
		bool = dos.readBoolean();
		c = dos.readChar();
		f = dos.readFloat();
		c1 = dos.readChar();
		
		
		dos.close();
	}
}
