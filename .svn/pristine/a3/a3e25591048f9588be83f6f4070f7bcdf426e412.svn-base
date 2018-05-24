package day36.工厂方法模式;

public abstract class Factory {
	abstract Moveable getInstance();
}
//下面是具体工厂实现
class PlaneFactory extends Factory
{

	@Override
	Moveable getInstance() {
		// TODO Auto-generated method stub
		return new Plane();
	}
	
}
class TractorFactory extends Factory
{

	@Override
	Moveable getInstance() {
		// TODO Auto-generated method stub
		return new Tractor();
	}
	
}
class CockFactory extends Factory
{
	Moveable getInstance() {
		
		return new Cock();
	}
}