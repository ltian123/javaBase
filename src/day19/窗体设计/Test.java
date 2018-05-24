package day19.窗体设计;
import java.awt.*;
import java.awt.event.*;
public class Test {
	public static void main(String[] args) {
		Frame f = new Frame("我的窗体");
		//设置大小
		f.setSize(300, 300);
		//设置背景为红色
		f.setBackground(Color.RED);
		//默认情况下，窗体是隐藏的
		f.setVisible(true);
		/*当窗体关闭符号被点击时，就会调用参数l中的方法windowClosing*/
		f.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e)
			 {	 
				 System.exit(0);
			 }
		});
	}
}
