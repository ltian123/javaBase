package day16.深克隆;
class Professor implements Cloneable
{
	String name;
	int age;
	Professor(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
/*一个类要深克隆，则必须把所有引用类型的属性全克隆出来，该 属性所属的类也要实现接口和
 * clone方法*/
public class Student implements Cloneable{
	String name;
	int age;
	Professor p;
	Student(String name,int age,Professor p){
		this.name = name;
		this.age = age;
		this.p = p;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		Student o = (Student)(super.clone());
		o.p = (Professor)p.clone();
		
		return o;
	}
}
