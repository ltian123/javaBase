package day20;
/*BorderLayout:上，下，左，右，中
 *FlowLayout:从左向右，从上到下排列
 * 
 * */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test1 {
	public static void main(String[] args) {
		Frame f = new JFrame("我的窗体");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		
		//设置大小
		f.setSize(333,300);
		//按照最适合的大小显示
//		f.pack();
		//让窗体显示到屏幕中间位置
		f.setLocationRelativeTo(null);
		
//		f.setLayout(new FlowLayout());
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT,50,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//下面代码最好放最后
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
