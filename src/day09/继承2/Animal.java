package day09.继承2;
/*每个类默认是继承自Object*/
public class Animal {
	String name = "张三";
	int age;
	String sex;
	public Animal()
	{
		System.out.println("父类animal中无参的构造方法");
	}
	public Animal(String name)
	{
		this.name = name;
		System.out.println("父类animal中一个参数的构造方法");
	}
	public Animal(String name,int age,String sex)
	{
//		this(name);
		this.age = age;
		this.name = name;
		this.sex = sex;
		System.out.println("父类animal中三个参数的构造方法");
	}
	
	public void show()
	{
		System.out.println("name="+name+",age="+age+",公母:"+sex);
	}
}
