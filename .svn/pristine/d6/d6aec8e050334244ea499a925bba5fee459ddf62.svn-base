package day12.可变字符串;
/*StringBuffer:是线程安全，多线程中效率不高
 *StringBuilder:多线程 不安全，但效率高
 * 
 * */
import java.util.*;
public class Test {
	public static void main(String[] args) {
//		StringBuffer s = new StringBuffer();
		StringBuilder s = new StringBuilder();
		s.append("java");
		s.insert(3, 3.14);
		
		s.insert(0,314);
		
		s.append(new Date());
		System.out.println(s);
		System.out.println(s.substring(3));
		//[3,7)
		System.out.println(s.substring(3,7));
		//删除前三个字符
		s.delete(0,3);
		
//		s.reverse();
		System.out.println(s);
		s.replace(2, 4, "哇哈哈");
		s.indexOf("e");
		System.out.println(s);
		
	}
}
