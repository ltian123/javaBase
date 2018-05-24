package day32.dao设计模式.database;

import java.util.*;

import day32.dao设计模式.Emp;
import java.sql.*;

public class EmpDAOImpl implements IEmpDAO{
	Connection con;
	PreparedStatement stat = null;
	public EmpDAOImpl(Connection con){
		this.con = con;
	}
	@Override
	public boolean doCreate(Emp emp) throws Exception {
		String sql = "insert into emp(id,name,job,sal)values(?,?,?,?)";
		stat = con.prepareStatement(sql);
		stat.setInt(1, emp.getId());
		stat.setObject(2, emp.getName());
		stat.setObject(3, emp.getJob());
		stat.setObject(4, emp.getSal());
		
		int update = stat.executeUpdate();
		stat.close();
		if(update>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Emp> findAll() throws Exception {
		String sql = "select * from emp";
		stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		Emp emp = null;
		List<Emp>list = new ArrayList<Emp>();
		while(rs.next()){
			emp = new Emp();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			list.add(emp);
			System.out.println(emp);
		}
		rs.close();
		stat.close();
		return list;
	}

	@Override
	public Emp findById(int id) throws Exception {
		String sql = "select * from emp where id=?";
		stat = con.prepareStatement(sql);
		stat.setInt(1, id);
		ResultSet rs = stat.executeQuery();
		Emp emp = null;
		
		if(rs.next()){
			emp = new Emp();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			
		}
		rs.close();
		stat.close();
		return emp;
	}

}
