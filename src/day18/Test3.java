package day18;
import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new SComp());
		
		t.add(new Student("李森",12,83));
		t.add(new Student("李瓜",22,13));
//		t.add(new Student("科比",15,45));
		
		System.out.println(t);
	}
}
class Student
{
	String name;
	int age;
	int score;
	public Student(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString()
	{
		return "name="+name+",age="+age+",score="+score;
	}
}

class SComp implements Comparator
{
	//o1是等待添加的元素，o2是集合中已经存在的元素
	public int compare(Object o1, Object o2) {
		System.out.println("o1==="+o1+",o2==="+o2);
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.age-s2.age;
		
	}
	
}