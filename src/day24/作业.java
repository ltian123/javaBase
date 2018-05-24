package day24;

import java.io.*;

public class 作业 {
	public static void main(String[] args) {
		copy1("d:/work/1.txt", "d:/work/2.txt");
	}

	public static void copy1(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			int num = 0;
			while ((num = is.read()) != -1) {
				os.write(transfer(num));
			}
		} catch (Exception e) {
			System.out.println("xxxxxx");
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}

			} catch (IOException e) {

			}
		}
	}

	public static void copy2(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			int num = 0;
			while ((num = bis.read()) != -1) {
				bos.write(transfer(num));
			}
			//刷新缓冲区，不管缓冲区内在中有多少数据，都会直接写入目标地址
			bos.flush();
			bis.close();
			bos.close();
		} catch (Exception e) {
			
		}
		

	}

	public static int transfer(int c) {
		if (c >= 'a' && c <= 'z') {
			return c - 32;
		} else if (c >= 'A' && c <= 'Z') {
			return c + 32;
		}
		return c;
	}
}
