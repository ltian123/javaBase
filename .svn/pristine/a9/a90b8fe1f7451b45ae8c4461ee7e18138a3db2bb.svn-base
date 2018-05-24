package day20.事件.焦点事件;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel jp = new JPanel();
		final JButton aa = new JButton("a");
		JButton bb = new JButton("b");
		
		jp.add(aa);jp.add(bb);
		f.add(jp);
		//给button添加焦点事件
		aa.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("a获取焦点...");
			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("a失去焦点...");
			}
			
		});
		
		//给button aa添加键盘事件
		aa.addKeyListener(new KeyListener(){
//把键盘上点击的字符显示到按钮上
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
	}
}
