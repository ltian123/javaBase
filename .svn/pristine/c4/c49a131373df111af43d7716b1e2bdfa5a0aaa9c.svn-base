package day18.HashMap使用;

public class Student {
	int num;
	String name;
	Student(int num,String name){
		this.num = num;
		this.name = name;
	}
	
	public int hashCode()
	{
		return num*name.hashCode();
	}
	
	public boolean equals(Object o){
		Student s = (Student)o;
		return num==s.num&&name.equals(s.name);
	}
}
