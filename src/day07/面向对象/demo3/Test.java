package day07.面向对象.demo3;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
//		s.name = "abc";
//		System.out.println(s.name);
//		s.age = 1000;
		s.setAge(10000);
		s.show();
	}
}
