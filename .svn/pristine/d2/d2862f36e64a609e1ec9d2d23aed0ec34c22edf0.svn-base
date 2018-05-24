package day28.倒计时;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.*;
import java.text.*;
public class ShowTime {
	public static void main(String[] args) {
		JFrame f = new JFrame("计时器");
		f.setSize(500, 300);
		f.setLayout(null);
		//弹出对话框
		final String timeStr = JOptionPane.showInputDialog(f, "请输入目标时间：");
		
		final JLabel time = new JLabel("");
		time.setFont(new Font("楷体",Font.BOLD,18));
		time.setBackground(Color.red);
		time.setBounds(122, 61, 222, 111);
		f.add(time);
		
		
		final JButton btn = new JButton("开始");
		btn.setBounds(180, 190, 130, 40);
		f.add(btn);
		//添加事件
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
//				new Thread(){
//					public void run()
//					{
//						
//					}
//					
//				}.start();
				/*每次点击button都会进来,进来后，关掉button的使能开关*/
				btn.setEnabled(false);
				Runnable r = new Runnable(){
					public void run() {
						while(true){
							Date now = new Date();
							//2016-10-01
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							Date d = null;
							try {
								d = sdf.parse(timeStr);
							} catch (ParseException e) {
							}
							long t = (d.getTime()-now.getTime())/1000;
							long day = t/(3600*24);
							long hour = t%(3600*24)/3600;
							long m = (t%3600)/60;
							long s = t%60;
							
							String times = day+"天"+hour+"时"+m+"分"+s+"秒";
							time.setText(times);
							if(t<=0){
								time.setText("Times Out!");
								break;
							}
						}
					}
				};
				new Thread(r).start();
				
			}	
		});
		
		JLabel lab = new JLabel("距离"+timeStr+"还有");
		lab.setBounds(24, 21, 165, 30);
		f.add(lab);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(3);	
	}
}


