package jdbc模版;
import java.sql.*;
import java.util.*;
/*使用这个类可能对数据库进行增删改查*/
public class JDBCTempleate {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	/*对数据库的增加、删除、修改*/
	public static void update(String  sql,Object ...args){
		conn = DBUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			/*设置sql的参数*/
			for(int i = 0;i<args.length;i++){
				pstmt.setObject(i+1, args[i]);
			}			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			
		}finally{
			DBUtil.closeAll(rs, pstmt, conn);
		}
		ArrayList <String>arr = new ArrayList();
	}
	/*第一个T是静态方法的泛型定义，因为在静态方法中不能使用类泛型，但可以使用方法泛型*/
	public static<E> List<E> query(String sql,RowMapper <E>rm,Object ...args)
	{	
		List <E>list = new ArrayList<E>();
		
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			/*设置sql的参数*/
			for(int i = 0;i<args.length;i++){
				pstmt.setObject(i+1, args[i]);
			}
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				E e = rm.mapRow(rs);
				list.add(e);
			}
			
		} catch (SQLException e) {
			
		}finally{
			DBUtil.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	
}
