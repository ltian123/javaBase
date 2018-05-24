package day23.计算器;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Computer implements ActionListener{
	JTextField jtf = new JTextField();
	//表示是否为继续追加数据
	boolean append;
	
	//操作数1和操作数2
	String op1;
	String op2;
	
	//运算符
	String oper;
	
	public Computer()
	{
		JFrame jf = new JFrame("计算器");
		jf.setLayout(null);
		jtf.setBounds(0, 0, 360, 50);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,4));
		
		String[]str = 
			{   "Back","CE","C","+",
				"7","8","9","-",
				"4","5","6","*",
				"1","2","3","/",
				"0",".","=","%"};
		JButton[]arr = new JButton[str.length];
		
		//添加控件
		jf.add(jtf);
		for(int i = 0;i<str.length;i++){
			arr[i] = new JButton(str[i]);
			arr[i].addActionListener(this);
			jp.add(arr[i]);
		}
		jp.setBounds(0, 60, 360, 200);
		jf.add(jp);
		
		jf.setSize(360,300);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(3);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*获取按钮上显示的字符串*/
		String comm = e.getActionCommand();
		//如果本次操作是数字
		if("0123456789".indexOf(comm)!=-1){
			if(append){
				String tmp = jtf.getText();
				jtf.setText(tmp+comm);
			}else{
				jtf.setText(comm);
				append = true;
			}
		}else if("+-*/".indexOf(comm)!=-1){
			oper = comm;
			op1 = jtf.getText();
			append = false;
		}else if(".".equals(comm)){
			String tmp = jtf.getText();
			if(tmp.indexOf(".")==-1){
				jtf.setText(tmp+".");
			}
		}else if("Back".equals(comm)){
			String tmp = jtf.getText();
			if(tmp.length()>0){
				jtf.setText(tmp.substring(0, tmp.length()-1));
			}
		}else if("C".equals(comm)){
			jtf.setText("0");
		}else if("=".equals(comm)){
			op2 = jtf.getText();
			double rs = 0;
			if("+".equals(oper)){
				rs = Double.parseDouble(op1)+Double.parseDouble(op2);
			}else if("-".equals(oper)){
				rs = Double.parseDouble(op1)-Double.parseDouble(op2);
			}else if("*".equals(oper)){
				rs = Double.parseDouble(op1)*Double.parseDouble(op2);
			}else if("/".equals(oper)){
				rs = Double.parseDouble(op1)/Double.parseDouble(op2);
			}
			jtf.setText(rs+"");
		}
		
	}
	public static void main(String[] args) {
		new Computer();
	}
}
