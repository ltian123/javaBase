package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	public static void regist()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("注册成功....");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败!");
		}
	}
	/*连接数据库*/
	public static Connection getConnection()
	{
		//localhost:表示127.0.0.1
		String url = "jdbc:mysql://localhost:3306/java";
		String name = "root";
		String pass = "123";
		
		try {
			Connection conn = DriverManager.getConnection(url, name, pass);
			System.out.println("数据库连接成功！");
			return conn;
		} catch (SQLException e) {
			System.out.println("数据库连接错误");
		}
		return null;
	}
}
