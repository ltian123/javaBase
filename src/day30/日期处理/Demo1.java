package day30.日期处理;
import java.sql.*;
import java.text.*;

import day30.Util;
public class Demo1 {
	public static void main(String[] args) {
		Util.regist();
		Connection con = Util.getConnection();
		
		try {
			Statement st = con.createStatement();
			String sql = "select * from t1";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString("name");
				//此处的date非util中date
				Date date = rs.getDate("time");
				//下面处理怎么把该 date转为util中date
				
				long time = date.getTime();
				java.util.Date uDate = new java.util.Date(time);
				System.out.println("id:"+id+",name:"+name+",date:"+formateTime(uDate));
			}
			
			con.close();
			st.close();
			rs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static String formateTime(java.util.Date date){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
		return df.format(date);
	}
}
