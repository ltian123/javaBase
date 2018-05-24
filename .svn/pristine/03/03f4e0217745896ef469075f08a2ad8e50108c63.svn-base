package day21.动态表的实现;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;

public class Test implements ActionListener {

	String[] titles = { "姓名", "性别", "年龄", "地址" };
	String[][] info = { { "艾贵", "人妖", "20", "泰国" }, { "艾贵", "帅哥", "20", "中国" },
			{ "小艾贵", "小帅哥", "18", "法国" }, { "拾凯", "男", "20", "英国" } };

	// 创建TableModel，用来封装列名字和行数据
	DefaultTableModel model = new DefaultTableModel(info, titles);

	public void show() {
		JFrame f = new JFrame("动态表");
		// JTable table = new JTable(info,titles);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);

		JPanel pnlSearch = new JPanel();
		JLabel label = new JLabel("根据条件查询学生");
		JButton bt = new JButton("查询");
		// 给button监听事件
		bt.addActionListener(this);

		pnlSearch.add(label);
		pnlSearch.add(bt);

//		f.add("Center", scroll);
		f.add("South", pnlSearch);
		f.add(scroll);
		f.add(pnlSearch,"South");

		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object[][] arr = { { "石佳", "男", "18", "泰国" },
				{ "吴继飞", "仙", "12", "中国" }, { "小艾贵", "小帅哥", "18", "法国" },
				{ "拾凯", "男", "20", "英国" }

		};
		model.setDataVector(arr, titles);
	}

	public static void main(String[] args) {
		new Test().show();
	}
}
