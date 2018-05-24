package day20;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Menu使用 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("我的菜单窗口");
		//1.创建菜单条
		JMenuBar mb = new JMenuBar();
		
		JTextArea text = new JTextArea();
		//设置文本是否可编辑
		text.setEditable(true);
		
		//2.创建菜单
		JMenu mFile = new JMenu("文件");
		
		//3.创建菜单项
		JMenuItem newFile = new JMenuItem("新建");
		JMenuItem openFile = new JMenuItem("打开");
		//菜单的事件
		newFile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//创建文件选择器
				JFileChooser f = new JFileChooser();
				//文件选择浏览显示
				int s = f.showOpenDialog(null);
				
				if(JFileChooser.APPROVE_OPTION==s){
					System.out.println(f.getSelectedFile());
				}
			}
			});
		
		mFile.add(newFile);
		mFile.add(openFile);
		
		mb.add(mFile);
		
		jf.add(mb,BorderLayout.NORTH);
		jf.add(text);
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);
	}
}
