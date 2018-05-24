package day30.添加数据;
import java.sql.*;
import day30.Util;
public class Add {
	/*每次添加一条记录*/
	public static void addOne()throws Exception {
		Util.regist();
		Connection conn = Util.getConnection();
		Statement st = conn.createStatement();
		/*返回值表示本次操作影响了多少行*/
		int result = st.executeUpdate("insert into stu values(4,'admin');");
		
		System.out.println("本次操作改变了"+result+"行");
		
		conn.close();
		st.close();
	}
	
	public static void main(String[] args)throws Exception {
		batchOper();
	}
	/*数据库的批处理*/
	public static void batchOper()throws Exception
	{
		Util.regist();
		Connection conn = Util.getConnection();
		Statement st = conn.createStatement();
		
		//添加批处理
		st.addBatch("insert into stu values(7,'aa')");
		st.addBatch("insert into stu values(8,'bb')");
		st.addBatch("insert into stu values(9,'cc')");
		
		//执行批处理
		st.executeBatch();
		show(st);
		conn.close();st.close();
		
	}
	public static void show(Statement st)throws Exception
	{
		ResultSet rs = st.executeQuery("select * from stu");
		while(rs.next()){
			/*第一列不是从0开始*/
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		rs.close();
	}
	
}
