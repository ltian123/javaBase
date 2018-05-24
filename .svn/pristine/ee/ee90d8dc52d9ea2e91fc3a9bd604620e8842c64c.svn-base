package day36.工厂设计模.简单工厂模式.组装电脑;

public interface Cpu {
	public int calculate();
}
class IntelCpu implements Cpu
{
	int pins = 0;
	public IntelCpu(int pins){
		this.pins = pins;
	}
	@Override
	public int calculate() {
		System.out.println("IntelCpu的针脚数："+pins);
		return pins;
	}	
}
class AMDCpu implements Cpu
{
	int pins = 0;
	public AMDCpu(int pins){
		this.pins = pins;
	}
	@Override
	public int calculate() {
		System.out.println("AMDCpu的针脚数："+pins);
		return pins;
	}
	
}