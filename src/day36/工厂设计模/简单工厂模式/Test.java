package day36.工厂设计模.简单工厂模式;

public class Test {
	public static void main(String[] args) {
		Factory f = new Factory();
		Moveable m1 = f.getInstance("plane");
		m1.go();
		Moveable m2 = f.getInstance("cock");
		m2.go();
	}
}
