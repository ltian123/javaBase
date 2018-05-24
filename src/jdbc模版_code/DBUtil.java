package jdbc模版_code;

import java.sql.*;

/*用于连接和关闭数据库*/
public class DBUtil {
	public static Connection getConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String pass = "123";
		Connection conn = null;
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("注册失败");
		}
		try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
		}
		return conn;
	}

	public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}

		} catch (SQLException e) {
			
		}finally{
			rs = null;
			stmt = null;
			conn = null;
		}

	}
}
