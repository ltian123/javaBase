package day17.HashSet扩展;
/*定义一个类Manager,
 * 有属性HashSet hs;
 * 提供方法如下：
 * 	void addEmployee(Employee e)//录入新员工
 * 	selectAll()//查询全部员工信息
 * 	selectById(String id)//查询某个员工
 * 	modifyById(String id,double sal)//修改某个员工工资 
 * */
public class Employee {
	String id;
	String name;
	double sal;
	
	public Employee(String id,String name,double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString()
	{
		return "name="+name+",id="+id+",sal="+sal;
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	//参数为集合中已经存在的，且hash码相同的元素
	public boolean equals(Object obj){
		Employee e = (Employee)obj;
		return id.equals(e.id);
	}
}
