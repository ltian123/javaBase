package day20.事件;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;

public class List事件 implements ListSelectionListener
{

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int tmp = 0;
		String stmp = "你目前选取：";
		//把用户所选中的所有列项的索引取出放入数组中
		int[]index = list.getSelectedIndices();
		
		for(int i = 0;i<index.length;i++){
			tmp = index[i];
			stmp = stmp+s[tmp]+" ";
		}
		label.setText(stmp);
	}
	
	JList list = null;
	JLabel label = null;
	String[]s = {"美 国","英 国","新加坡","意大利","德 国"};
	
	public List事件()
	{
		JFrame f = new JFrame();
		label = new JLabel("请选择：");
		list = new JList(s);
		//给list添加边框及标题
		list.setBorder(new TitledBorder("你喜欢去哪些国家玩"));
		list.addListSelectionListener(this);
		
		f.add(label,BorderLayout.NORTH);
//		f.add(list);
		JScrollPane js = new JScrollPane(list);
		f.add(js);
		//按默认大小显示
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new List事件();
	}

}
