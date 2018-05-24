package day36.抽象工厂模式;

public interface AbstractFactory {
	//用于创建cpu对象
	public Cpu createCpu();
	//用于创建主板对象
	public Mainboard createMainboard();
	
}
class IntelFactory implements AbstractFactory
{

	@Override
	public Cpu createCpu() {
		return new IntelCpu(735);
	}

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard(735);
	}
	
	
}
class AMDFactory implements AbstractFactory
{

	@Override
	public Cpu createCpu() {
		return new AMDCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		return new AMDMainboard(938);
	}
}
