package day19.作业;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Student s1 = new Student("s1", 12);
		Student s2 = new Student("s2", 22);
		Student s3 = new Student("s3", 2);
		Student s4 = new Student("s4", 15);

		hm.put(s1.name, s1);
		hm.put(s2.name, s2);
		hm.put(s3.name, s3);
		hm.put(s4.name, s4);

	}

	public static void m1(HashMap<String, Student> hm) {
		System.out.println("===方法一====");

		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println("姓名：" + name + ",年龄：" + hm.get(name).age);
		}
	}

	public static void m2(HashMap<String, Student> hm) {
		System.out.println("===方法二====");

		Set set = hm.entrySet();
		Iterator<Map.Entry<String, Student>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Student> e = it.next();
			System.out.println("姓名：" + e.getKey() + ",年龄：" + e.getValue().age);
		}
	}
	
	public static void m3(HashMap <String,Student>hm){
		System.out.println("===方法三====");
		
		Collection c = hm.values();
		Iterator <Student>it = c.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println("姓名：" + s.name + ",年龄：" + s.age);
		}
		
	}
}
