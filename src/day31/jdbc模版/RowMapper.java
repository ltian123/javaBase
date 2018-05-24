package day31.jdbc模版;
import java.sql.*;
public interface RowMapper <T>{
	/*通过rs当前的游标获取当前行的数据，并封装成T对象返回*/
	public T mapRow(ResultSet rs)throws SQLException;
	/*
	 * int id = rs.getInt(1);
	 * String name = rs.getString(2);
	 * ......
	 * 
	 * 
	 * 
	 * */
}
