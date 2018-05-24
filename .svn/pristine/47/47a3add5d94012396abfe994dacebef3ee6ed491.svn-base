package day36.抽象工厂模式;

public class ComputerEngineer {
	Cpu cpu = null;
	Mainboard mainboard = null;
	public void makeComputer(AbstractFactory af){
		this.cpu = af.createCpu();
		this.mainboard = af.createMainboard();
		
		if(cpu.calculate()==this.mainboard.installCpu()){
			System.out.println("产品兼容...");
		}
	}
	
	public static void main(String[] args) {
		ComputerEngineer cf = new ComputerEngineer();
		cf.makeComputer(new AMDFactory());
		cf.makeComputer(new IntelFactory());
	}
}
