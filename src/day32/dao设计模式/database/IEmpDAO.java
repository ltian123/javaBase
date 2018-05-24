package day32.dao设计模式.database;
import day32.dao设计模式.Emp;
import java.util.*;
/*用于声明对数据库可进行的操作*/
public interface IEmpDAO {
	//增加一条记录
	public boolean doCreate(Emp emp)throws Exception;
	//无条件的查询全部功能
	public List<Emp>findAll()throws Exception;
	//查询一个
	public Emp findById(int id)throws Exception;	
}
