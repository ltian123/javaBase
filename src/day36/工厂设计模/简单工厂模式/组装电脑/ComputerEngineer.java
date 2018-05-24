package day36.工厂设计模.简单工厂模式.组装电脑;

public class ComputerEngineer {
	Cpu cpu = null;
	Mainboard mainboard = null;
	public void makeComputer(int cpuType,int mainboardType){
		this.cpu = CpuFactory.create(cpuType);
		mainboard = MainboardFactory.create(mainboardType);
		
		if(cpu.calculate()==mainboard.installCpu()){
			System.out.println("产品兼容，可以装机");
		}else{
			System.out.println("不兼容，无法组装");
		}
	}
	
	public static void main(String[] args) {
		ComputerEngineer cf = new ComputerEngineer();
		cf.makeComputer(2, 2);
	}
}
