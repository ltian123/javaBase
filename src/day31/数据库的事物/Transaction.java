package day31.数据库的事物;
import java.sql.*;

import jdbc模版.*;
public class Transaction {
	public static void main(String[] args) throws Exception{
		transaction2();
	}
	static void transaction()throws Exception
	{
		Connection con = DBUtil.getConnection();
		Statement st = null;
		
		//取消自动提交功能
		try {
			st = con.createStatement();
			con.setAutoCommit(false);
			st.executeUpdate("insert into user_t values(4,'java',22)");
			//下面会抛出异常
			st.executeUpdate("insert into user_t values(4,'c++',12)");
			con.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			/*执行数据库回滚*/
			con.rollback();
		}finally{
			con.setAutoCommit(true);
			DBUtil.closeAll(null, st, con);
		}
	}
	/*带保存点的事务:有选择性的回滚
	 * */
	static void transaction2()throws Exception
	{
		Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
		Savepoint sp = null;
		try{
			con.setAutoCommit(false);
			st.executeUpdate("insert into user_t values(5,'java',22)");
			//下面会抛出异常
			st.executeUpdate("insert into user_t values(6,'c++',12)");
			/*在产生保存点后，如果前面两条成功，则在回滚时，不会把前两条成功的回滚*/
			sp = con.setSavepoint();
			
			st.executeUpdate("insert into user_t values(7,'java',22)");
			st.executeUpdate("insert into user_t values(7,'c++',12)");		
			con.commit();
		}catch(Exception e){
			System.out.println(e.getMessage());
			con.rollback(sp);
		}finally{
			con.setAutoCommit(true);
			DBUtil.closeAll(null, st, con);
		}
		
		
	}
	
}
