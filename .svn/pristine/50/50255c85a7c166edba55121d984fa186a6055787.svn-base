package day17.HashSet扩展;
import java.util.*;
public class Manager {
	private HashSet hs;
	public Manager()
	{
		hs = new HashSet();
	}
	public void addEmployee(Employee e){
		hs.add(e);
	}
	public void select()
	{
		System.out.println("=======所有员工信息如下========");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Employee e = (Employee)it.next();
			System.out.println("id:"+e.id+"\t name:"+e.name+"\tsal:"+e.sal);
		}
	}
	
	public Employee selectById(String id){
		System.out.println("编号为"+id+"的员工信息如下：");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Employee e = (Employee)it.next();
			if(e.id.equals(id)){
				System.out.println("id:"+e.id+"\t name:"+e.name+"\tsal:"+e.sal);
				return e;
			}
		}
		return null;
	}
	
	public Employee selectById(String id,double sal){
		System.out.println("修改编号为"+id+"的员工后信息如下：");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Employee e = (Employee)it.next();
			if(e.id.equals(id)){
				e.sal = sal;
				System.out.println("id:"+e.id+"\t name:"+e.name+"\tsal:"+e.sal);
				return e;
			}
		}
		return null;
	}
}
