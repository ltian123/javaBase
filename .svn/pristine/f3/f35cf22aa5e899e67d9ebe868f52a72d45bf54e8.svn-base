package day19.Property;
import java.util.*;
import java.io.*;
public class 练习 {
	public static void main(String[] args)throws Exception {
		Properties p = new Properties();
		Reader reader = new FileReader("abc.txt");
		p.load(reader);
		
		String user = p.getProperty("user");
		String pass = p.getProperty("pass");
		
//		System.out.println(user);
//		System.out.println(pass);
		System.out.println("请输入用户名及密码，用逗号隔开");
		Scanner in = new Scanner(System.in);
		int errCount = 0;
		while(true){
			String tmp = in.next();
			String[]arr = tmp.split(",");
			if((user.equals(arr[0]))&&pass.equals(arr[1])){
				System.out.println("正确，成功登录");
				return;
			}else{
				System.out.println("用户名或密码错误");
				errCount++;
				if(errCount<3){
					System.out.println("请重新输入：");
				}else{
					System.out.println("错误次数太多，退出");
					return;
				}
			}
		}
	}
}
