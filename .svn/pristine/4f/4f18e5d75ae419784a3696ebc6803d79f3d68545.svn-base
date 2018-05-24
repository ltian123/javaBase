package day36.工厂设计模.简单工厂模式.组装电脑;

public class MainboardFactory {
	public static Mainboard create(int type)
	{
		Mainboard mainboard= null;
		if(type==1){
			mainboard = new IntelMainboard(755);
		}else if(type==2){
			mainboard = new AMDMainboard(938);
		}
		return mainboard;
	}
}
