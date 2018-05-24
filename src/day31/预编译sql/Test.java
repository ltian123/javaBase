package day31.预编译sql;
import java.sql.*;
import java.util.*;
import day30.Util;
public class Test {
	public static void main(String[] args) throws SQLException {
		Util.regist();
		Connection con = Util.getConnection();
		String n = "tom";
//		String sql = "select * from t2 where name="+"'"+n+"'";
		String sql = "select * from t2 where name=? and score >?";
		/*PreparedStatement是Statement 的子接口，功能更多*/
		PreparedStatement ps = con.prepareStatement(sql);
		/*给参数传值*/
		ps.setString(1, "tom");
		ps.setInt(2, 70);
		/*不可带参数*/
		ResultSet rs = ps.executeQuery();
		ArrayList <Student>arr = new ArrayList<Student>();
		while(rs.next()){
			Student user = new Student();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setScore(rs.getInt(3));
			arr.add(user);
		}
		
		for(Student u:arr){
			System.out.println(u);
		}
		
		con.close();
		ps.close();
		rs.close();
	}
	
}
