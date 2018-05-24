package day36.工厂方法模式;

public class Test {
	public static void main(String[] args) {
		Factory f1 = new PlaneFactory();
		f1.getInstance().go();
		
		Factory f2 = new CockFactory();
		f2.getInstance().go();
	}
}
