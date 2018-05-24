package day21.定时器;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Jtable的使用 {
	public static void main(String[] args) {
		JFrame f = new JFrame("");
		
		String[]titles = {"姓名","性别","年龄","地址"};
		String[][]info = {
				{"艾贵","人妖","20","泰国"},
				{"艾贵","帅哥","20","中国"},
				{"小艾贵","小帅哥","18","法国"},
				{"拾凯","男","20","英国"}		
		};
		
		JTable jt = new JTable(info,titles);
		
//		f.add(jt);
		JScrollPane jsp = new JScrollPane(jt);
		f.add(jsp);
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
	}
}
