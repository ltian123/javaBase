package day16.集合;

public class Student {
	String name;
	int age;
	int count = 1;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return "name:"+name+",age:"+age;
	}
//	public boolean remove(Object obj){
//		return false;
//	}
	public boolean equals(Object obj) {
		
		System.out.println("调用equals"+count+"次");
		count++;
		if(this==obj){
			return true;
		}
		//判断某个实例对象是否是某个类或其子类的实例
		if(!(obj instanceof Student)){
			return false;
		}
		Student s = (Student)obj;
		if(name.equals(s.name)&&age==s.age){
			return true;
		}
		
		return false;
    }
}
