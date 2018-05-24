package day20.事件;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Test {
	public static void main(String[] args) {
		JFrame jf = new JFrame("事件");
		final JButton b = new JButton("18");
		jf.add(b);
		
		//b.addActionListener(new Event());
		ActionListener a = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
//				int count = Integer.parseInt(b.getText());
//				b.setText((++count)+"");
				
				JButton b = (JButton)e.getSource();
				int count = Integer.parseInt(b.getText());
				b.setText((++count)+"");
			}
			
		};
		b.addActionListener(a);
		
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);
	}
}
class Event implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		//获取控件上显示的字符串
		String s = e.getActionCommand();
		//获取所点击的控件本身
		JButton b = (JButton)e.getSource();
		System.out.println("======="+b.getText());
		b.setText("哈哈");
		System.out.println(s);
	}
	
}