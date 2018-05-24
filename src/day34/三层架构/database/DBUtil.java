package day34.三层架构.database;
import java.sql.*;
/*提供连接和关闭功能*/
public class DBUtil {
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("注册成功....");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败!");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/java";
		String name = "root";
		String pass = "123";
		
		try {
			conn = DriverManager.getConnection(url, name, pass);
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			System.out.println("数据库连接错误");
		}
		return conn;
	}
	
	public static void closeAll(ResultSet rs,Statement stmt,Connection conn){
		try{
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}catch(Exception e){
			
		}
	}
}
