package day34.三层架构.database;

import java.util.*;
import java.sql.*;

import day34.三层架构.User;

public class UserDAOImpl implements USerDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUser(User u) {
		boolean flag = false;
		String sql = "select * from user where name=? and pass=?";
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getPass());
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				flag = true;
			}
			
		} catch (SQLException e) {
			
		}finally{
			DBUtil.closeAll(rs, pstmt, conn);
		}
		
		return flag;
	}

	@Override
	public boolean getUserByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
