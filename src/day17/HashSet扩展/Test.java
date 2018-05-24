package day17.HashSet扩展;
import java.util.*;	
public class Test {
	public static void test(String[] args) {
		HashSet <Employee>hs = new HashSet<Employee>();
		Employee e1 = new Employee("id1","葛云飞",6000);
		Employee e2 = new Employee("id2","张阿曼",8000);
		Employee e3 = new Employee("id3","王双凤",7000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(new Employee("id3","王双凤",7000));
		
		System.out.println("=====集合中的元素为========");
		Iterator <Employee>it = hs.iterator();
		while(it.hasNext()){
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.id);
			System.out.println(e.sal);
//			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		Manager hr = new Manager();
		Employee e1 = new Employee("007","蒋程",5000);
		Employee e2 = new Employee("008","马克死",4000);
		Employee e3 = new Employee("009","陈猛",8000);
		
		hr.addEmployee(e1);
		hr.addEmployee(e2);
		hr.addEmployee(e3);
		hr.addEmployee(new Employee("009","陈猛",8000));
		
		hr.select();
	}
}
