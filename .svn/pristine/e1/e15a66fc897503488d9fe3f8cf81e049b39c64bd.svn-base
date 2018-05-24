package day32.dao设计模式.App;

import day32.dao设计模式.Emp;
import day32.dao设计模式.logic.*;
public class Test {
	
	public static void main(String[] args) throws Exception {
		Emp emp = null;
		System.out.println("=========添加员工=======");
		for(int i = 1;i<5;i++){
			emp = new Emp();
			emp.setId(i);
			emp.setName("java"+i);
			emp.setJob("stu-"+i);
			emp.setSal(500*(i+1));
			Factory.getInstance().doCreate(emp);
		}
		
		System.out.println("======查询=======");
		System.out.println(Factory.getInstance().findById(3));
	}
}
