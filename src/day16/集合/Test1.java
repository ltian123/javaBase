package day16.集合;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		ArrayList <Student>al = new ArrayList<Student>();
		al.add(new Student("熊大",2));
		al.add(new Student("熊二",1));
		al.add(new Student("光头强",3));
		Student s = new Student("李老板",20);
		al.add(s);
		al.add(null);
		al.remove(null);
		
		for(int i = 0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
}
