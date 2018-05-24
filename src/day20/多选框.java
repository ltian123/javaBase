package day20;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 多选框 extends JFrame {
	public 多选框()
	{
		//下面是正方形的多选框
		JCheckBox c1 = new JCheckBox("阅读",false);
		JCheckBox c2 = new JCheckBox("音乐",false);
		JCheckBox c3 = new JCheckBox("游戏",false);
		
		//让选择框具有单选效果
		ButtonGroup gr1 = new ButtonGroup();
		gr1.add(c1);gr1.add(c2);gr1.add(c3);
		
		//下面是圆形多选框
		JRadioButton b1 = new JRadioButton("大专");
		JRadioButton b2 = new JRadioButton("本科");
		JRadioButton b3 = new JRadioButton("硕士");
		
		JLabel l1 = new JLabel("你有什么爱好？");
		JLabel l2 = new JLabel("你的最高学历？");
		
		JButton exit = new JButton("退出");
		
		this.setLayout(new GridLayout(9,1));
		
		add(l1);add(c1);add(c2);add(c3);
		
		add(l2);add(b1);add(b2);add(b3);
		add(exit);
		
		this.setSize(300,300);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new 多选框();
	}
}
