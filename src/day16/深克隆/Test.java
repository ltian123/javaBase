package day16.深克隆;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Professor p = new Professor("徐娅",18);
		Student s1 = new Student("陈猛",20,p);
		
		Student s2 = (Student)(s1.clone());
		s1.p.age = 20;
		System.out.println(s2.name);
		System.out.println(s2.p.age);
	}
}
