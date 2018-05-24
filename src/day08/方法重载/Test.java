package day08.方法重载;

public class Test {
	public static void main(String[] args) {
		Car c = new Car("红色","宝马",1);
		/*直接打印对象时，本质上是打印的该对象的toString方法所返回的字符串*/
		System.out.println(c);
	}
}
