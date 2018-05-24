package day19.Property;
import java.io.*;
import java.util.*;
public class Test {
	public static void test(String[] args) {
		Properties p = new Properties();
		
		p.put("userName", "tom");
		p.setProperty("password", "123");
		p.setProperty("sex", "男");
		
		//获取数据
		String name = p.getProperty("userName");
		System.out.println(name);
	}
	
	public static void main(String[] args)throws Exception {
		Properties p = new Properties();
		Reader reader = new FileReader("abc.txt");
		//把数据放放properties中
		p.load(reader);
		
		System.out.println(p);
		System.out.println(p.get("pass"));
	}
}
