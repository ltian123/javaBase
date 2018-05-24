package day32.元数据;
import java.sql.*;
import java.util.*;
import jdbc模版.*;
public class Demo1 {
	public static void main(String[] args) throws Exception {
		System.out.println("获取数据库的元数据");
		Connection con = DBUtil.getConnection();
		DatabaseMetaData dm = con.getMetaData();
		System.out.println(dm.getDatabaseProductName());
		//得到版本编号
		System.out.println(dm.getDatabaseProductVersion());
		//得到驱动信息
		System.out.println(dm.getDriverName());
		System.out.println(dm.getDriverVersion());
		System.out.println("数据库地址："+dm.getURL());
		System.out.println("用户名："+dm.getUserName());
		
		System.out.println("=====结果集的元数据=========");
		PreparedStatement ps = con.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData md = rs.getMetaData();
		//获取列数
		int count = md.getColumnCount();
		System.out.println(count);
		for(int i = 1;i<=count;i++){
			System.out.println(md.getColumnName(i));
		}
		
		ArrayList arr = getPri("dept");
		System.out.println(arr);
	}
	/*获取表的主键*/
	static ArrayList<String>getPri(String tableName)throws Exception{
		Connection con = DBUtil.getConnection();
		DatabaseMetaData dm = con.getMetaData();
		ResultSet rs = dm.getPrimaryKeys(null, null, tableName);
		ArrayList <String>arr = new ArrayList<String>();
		while(rs.next()){
			arr.add(rs.getString("COLUMN_NAME"));
		}
		return arr;
	}
}
