package day16.克隆;

public class Test {
	public static void main(String[] args)throws CloneNotSupportedException {
		Dog d1 = new Dog();
		d1.name = new StringBuffer("小黄");
		d1.age = 10;
//		Dog d2 = new Dog();
//		d2.name = "小黄";
//		Dog d2 = (Dog)(new Test().clone());克隆出来的是Test对象
		Dog d2 = (Dog)(d1.clone());
		d1.name.insert(0, "abc");
		d1.age = 100;
		System.out.println(d2.name);
		System.out.println(d2.age);
	}
}
