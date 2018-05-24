package day36.工厂设计模.简单工厂模式;

public interface Moveable {
	void go();
}
class Plane implements Moveable{

	@Override
	public void go() {
		System.out.println("嗡嗡嗡，我是强大的战斗机....");
	}
}
class Tractor implements Moveable
{
	@Override
	public void go() {
		System.out.println("嚓嚓嚓，我是勤劳的拖拉机...");
	}
}
class Cock implements Moveable
{
	@Override
	public void go() {
		System.out.println("喔喔喔，我是威武的大公鸡....");
	}	
}