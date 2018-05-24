package day36.工厂设计模.简单工厂模式.组装电脑;

public interface Mainboard {
	public int installCpu();
}
class IntelMainboard implements Mainboard
{
	int cpuHoles = 0;
	
	public IntelMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public int installCpu() {
		System.out.println("Intel主板的cpu插孔数是"+cpuHoles);
		
		return this.cpuHoles;
	}
	
}
class AMDMainboard implements Mainboard
{
	int cpuHoles = 0;
	
	public AMDMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	@Override
	public int installCpu() {
		System.out.println("AMDMainboard主板的cpu插孔数是"+cpuHoles);	
		return this.cpuHoles;
	}
}