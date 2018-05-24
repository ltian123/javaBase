/*三层的任务如下分配：
 * 	view：只处理界面
 * 	service:只处理业务逻辑处理
 * 	database:只处理数据库的操作
 * */


package day34.三层架构.view;
import java.awt.*;
import day34.三层架构.service.*;
import javax.swing.*;
import day34.三层架构.User;
import java.awt.event.*;
public class Login implements ActionListener{
	JFrame f = new JFrame("登录与注册");
	JLabel welcome = new JLabel("欢迎使用本软件！");
	JLabel lblUserName = new JLabel("用户名：");
	//参数表示该文本框默认有多宽
	JTextField txtUserName = new JTextField(20);
	JLabel lblPassword = new JLabel("密    码：");
	JPasswordField txtPassword = new JPasswordField(20);
	
	//button
	JButton btnLogin = new JButton("登录");
	JButton btnExit = new JButton("退出");
	JButton btnReg = new JButton("注册");
	//4行面板
	JPanel[]pnls = new JPanel[4];
	UserService us = new UserServiceImpl();
	//初始化组件
	public Login()
	{
		f.setLayout(new GridLayout(4,1));
		for(int i = 0;i<pnls.length;i++){
			pnls[i] = new JPanel();
			f.add(pnls[i]);	
		}
		welcome.setFont(new Font("楷体",Font.BOLD,20));
		welcome.setForeground(Color.red);
		pnls[0].add(welcome);
		
		pnls[1].setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		pnls[1].add(lblUserName);
		pnls[1].add(txtUserName);
		
		pnls[2].setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		pnls[2].add(lblPassword);
		pnls[2].add(txtPassword);
		
		pnls[3].setLayout(new FlowLayout(FlowLayout.CENTER,20,0));
		pnls[3].add(btnLogin);
		pnls[3].add(btnExit);
		pnls[3].add(btnReg);
		
		//添加监听事件
		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);
		btnReg.addActionListener(this);
		
		f.setSize(400,300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(3);
		//不允许改变大小
		f.setResizable(false);
		f.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//获取本次点击事件按钮上的字符串
		String cmd = e.getActionCommand();
		String username = txtUserName.getText();
		String password = new String(txtPassword.getPassword());
		User u = new User();
		u.setName(username);
		u.setPass(password);
		
		if(cmd.equals("登录")){
			//登录成功
			if(us.login(u)){
				//关闭当前窗口，弹出新窗口
				f.dispose();
				new ManOper();
			}else{
				JOptionPane.showMessageDialog(f, "用户名或密码不正确");
			}
		}else if(cmd.equals("注册")){
			if(us.register(u)){
				JOptionPane.showMessageDialog(f, "注册成功");
			}else{
				JOptionPane.showMessageDialog(f, "注册失败");
			}
		}else{
			System.exit(0);
		}
		
		
		
	}
	public static void main(String[] args) {
		new Login();
	}
}
