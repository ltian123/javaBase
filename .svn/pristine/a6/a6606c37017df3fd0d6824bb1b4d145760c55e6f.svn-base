package day30;
import java.sql.*;
public class Demo1 {
	public static void main(String[] args) {
		regist();
		Connection conn = getConnection();
		oper1(conn);
	}
	/*注册驱动*/
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
	/*查询某个数据库中有多少张表*/
	public static void oper1(Connection conn){
		if(conn==null){
			return ;
		}
		Statement st=null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("show tables");
			
			while(rs.next()){
				/*获取字段值*/
				System.out.println(rs.getString("Tables_in_java"));
			}
			
		} catch (SQLException e) {
			System.out.println("产生statement错误");
		}
		try {
			conn.close();
			if(st!=null){
				st.close();
			}
			
		} catch (SQLException e) {
			
		}
	}
}
