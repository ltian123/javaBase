package day32.dao设计模式.logic;

import day32.dao设计模式.database.*;

/*产生各种代理对象*/
public class Factory {
	public static IEmpDAO getInstance()
	{
		IEmpDAO dao = null;
		try {
			dao = new EmpDAOProxy();
		} catch (Exception e) {
			
		}
		return dao;
	}
}
