package day20.GridLayout使用;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*GridLayout:
 * 1.当同时指定行数和列数时，会忽略列数的限制
 * 2.只有当行数为0时，列才有效
 * 3.每个单元格大小相同 
 * */
public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		JButton b3 = new JButton("按钮3");
		JButton b4 = new JButton("按钮4");
		JButton b5 = new JButton("按钮5");
		JButton b6 = new JButton("按钮6");
		JButton b7 = new JButton("按钮7");
		
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		
		f.setLayout(new GridLayout(0,3));
		
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);
		f.add(b5);f.add(b6);f.add(b7);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
