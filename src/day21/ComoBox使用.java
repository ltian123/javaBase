package day21;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/*JCombBox:
 * 
 * */
public class ComoBox使用 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel label = new JLabel("请选择你的学历：");
		String[]degrees = {"大专","本科","研究生","愽士"};
		
		JComboBox cmb = new JComboBox(degrees);
		/*添加事件*/
		cmb.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("选中："+e.getItem());
				}
				
			}
		});
		
		f.add(label);
		f.add(cmb);
		f.setSize(300,300);
		f.setLocationRelativeTo(null);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
