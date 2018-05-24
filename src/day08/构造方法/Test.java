package day08.构造方法;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("abc",23,"北京");
		System.out.println(s2.address);
	}
	
}
