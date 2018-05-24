package day32.dao设计模式.database;
import java.sql.*;
/*用来打开和关闭数据*/
public class DataBaseConnection {
	Connection con = null;
	String driver = "com.mysql.jdbc.Driver";
	String user = "root";
	String pass = "123";
	String url = "jdbc:mysql://localhost:3306/java";
	/*每次产生本类的实例对象时，一定会产生一新的连接*/
	public DataBaseConnection()throws Exception
	{
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pass);
	}
	/*打开数据库*/
	public Connection getConnection()throws Exception
	{
		return con;
	}
	/*关闭数据库*/
	public void close()throws Exception
	{
		if(con!=null){
			con.close();
		}
	}
}
