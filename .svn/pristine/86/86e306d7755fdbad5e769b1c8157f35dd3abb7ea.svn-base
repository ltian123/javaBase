package day33.url使用;
import java.io.*;
import java.net.*;
/*ftp://teacher@172.16.1.11/wbs16072/1.txt*/
public class Test {
	public static void main(String[] args)throws Exception {
		URL url = new URL("ftp://teacher:itany123@172.16.1.11/wbs16072/1.txt");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"gbk"));
		String str = null;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
	}
}
