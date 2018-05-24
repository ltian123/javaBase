package day19.作业;
import java.util.*;
public class HashTable使用 {
	
	public static void main(String[] args) {
		Hashtable <Student,String>ht = new Hashtable<Student,String>();
		Student s1 = new Student("s1", 12);
		Student s2 = new Student("s2", 22);
		Student s3 = new Student("s3", 2);
		Student s4 = new Student("s4", 15);
		
		ht.put(s1, s1.name);
		ht.put(s2, s2.name);
		ht.put(s3, s3.name);
		ht.put(s4, s4.name);
		
		//1.ht.keySet();获取全部的key
		//2.ht.values();
		//3.ht.entrySet();
		//4.使用Enumeration,获取全部key的枚举
		Enumeration <Student>e = ht.keys();
		while(e.hasMoreElements()){
			Student s = e.nextElement();
			String name = ht.get(s);
		}
		//5.获取全部value的枚举
		Enumeration <String>e2 = ht.elements();
		while(e2.hasMoreElements()){
			System.out.println(e2.nextElement());
		}
	}
}
