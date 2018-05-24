package day13.接口的应用;

public interface IUsb {
	int v = 10;
	void power();
}
class Mouse implements IUsb
{
	void show(){
		
	}
	
	public void power() {
		System.out.println("符合接口规范的鼠标可以使用");
	}
	
}
class Keybord implements IUsb
{
	public void power() {
		System.out.println("符合接口规范的键盘可以使用");
	}
}
class Computer
{
	public void device(IUsb usb){
		usb.power();
//		usb.show();
	}
}