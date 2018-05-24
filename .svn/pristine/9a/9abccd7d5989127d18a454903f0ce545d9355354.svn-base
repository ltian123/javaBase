package day31.模版使用;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbc模版.*;

public class DbOper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs) throws SQLException {
		User u = new User();
		u.id = rs.getInt(1);
		u.name = rs.getString(2);
		u.age = rs.getInt(3);
		return u;
	}

	public static void main(String[] args) {
		DbOper db = new DbOper();
		db.insert();
	}
	
	void insert()
	{
		JDBCTempleate.update("insert into user_t(name,age)values(?,?)","tom",23);
	}
	
	void showAll()throws Exception
	{
		List<User>arr = JDBCTempleate.query("select * from user_t", this, new Object[]{});
		for(User u:arr){
			System.out.println(u);
		}
	}
	public void showOne()throws Exception
	{
//		User u = JDBCTempleate.queryForObject("select * from user_t where id=?",this,3);
	
	}
}
