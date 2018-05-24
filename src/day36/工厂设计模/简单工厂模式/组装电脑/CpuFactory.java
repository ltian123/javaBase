package day36.工厂设计模.简单工厂模式.组装电脑;

public class CpuFactory {
	public static Cpu create(int type)
	{
		Cpu cpu= null;
		if(type==1){
			cpu = new IntelCpu(755);
		}else if(type==2){
			cpu = new AMDCpu(938);
		}
		return cpu;
	}
}
