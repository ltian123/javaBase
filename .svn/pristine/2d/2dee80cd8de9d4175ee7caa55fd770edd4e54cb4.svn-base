package day32.dao设计模式.logic;
import java.util.List;

import day32.dao设计模式.Emp;
import day32.dao设计模式.database.*;
public class EmpDAOProxy implements IEmpDAO{
	//通过下面属性可得到一个数据库连接
	DataBaseConnection dbc;
	IEmpDAO dao = null;
	public EmpDAOProxy() throws Exception{
		dbc = new DataBaseConnection();
		dao = new EmpDAOImpl(dbc.getConnection());
	}
	@Override
	public boolean doCreate(Emp emp) throws Exception {
		boolean flag = false;
		if(dao.findById(emp.getId())==null){
			flag = dao.doCreate(emp);
		}
//		dbc.close();
		return flag;
	}
	@Override
	public List<Emp> findAll() throws Exception {
		List<Emp>list = dao.findAll();
		
		return list;
	}
	@Override
	public Emp findById(int id) throws Exception {
		
		return dao.findById(id);
	}
	
}
