package day19.窗体设计;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
/*Frame和JFrame的默认布局是BorderLayout,其特点是：
 * 只能在五个位置放控件：东，南，西，北，中*/
public class Test1 extends JFrame{
	public Test1()
	{
		JButton b1 = new JButton("确定");
		JButton b2 = new JButton("取消");
		
		this.add(b1,BorderLayout.NORTH);
		
		this.add(b2,BorderLayout.WEST);
		
//		this.setBackground(Color.RED);
//		this.getContentPane().setVisible(false);
		
		this.getContentPane().setBackground(Color.red);
		this.setSize(300, 300);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test1();
	}
}
