package day20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("按钮1");

		JTextField jtf = new JTextField();
		JLabel jl = new JLabel("afdfda");

		JTextArea jta = new JTextArea();
		// true让textArea会换行
		jta.setLineWrap(true);

		// JPanel的默认布局为FlowLayout
		JPanel p = new JPanel();
		p.add(new JButton("Panel的Button"));
		p.setBackground(Color.red);
		
		b.setBounds(3, 6, 80, 50);
		jl.setBounds(90, 160, 200, 100);
		jta.setBounds(200, 200, 300, 300);
		jtf.setBounds(90, 50, 200, 100);
		p.setBounds(500, 100, 200, 200);
		
		f.setLayout(null);

		f.add(b);
		f.add(jtf);
		f.add(jl);
		f.add(jta);
		f.add(p);

		f.setSize(800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
	}
}
