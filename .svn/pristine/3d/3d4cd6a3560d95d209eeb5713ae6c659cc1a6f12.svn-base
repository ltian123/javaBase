package day20;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class BackGround extends JFrame{
	public BackGround()
	{
		super("背景图片");
		ImageIcon i = new ImageIcon("C:/Users/USER02/Desktop/1.jpg");
		//获取图片的宽和高
		int width = i.getIconWidth();
		int height = i.getIconHeight();
		
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, width, height);
		
		//获取层面板
		Container con = this.getLayeredPane();
		//第二个参数会使label图片永远在最下面
		con.add(label,new Integer(Integer.MIN_VALUE));
		
		JButton b = new JButton("在吗?");
		
		this.setLayout(new FlowLayout());
		this.add(b);
		
		//让上面的内容面板透明化
		JPanel content = (JPanel)this.getContentPane();
		content.setOpaque(false);
		
		this.setSize(width, height);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new BackGround();
	}
}
