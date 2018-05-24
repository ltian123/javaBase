package jdbc模版_code;
import java.sql.*;
public interface RowMapper <T>{
	/*通过rs当前的游标获取当前行的数据，并封装成T对象返回*/
	public T mapRow(ResultSet rs)throws SQLException;
}
