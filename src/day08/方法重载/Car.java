package day08.方法重载;

public class Car {
	String name;
	String color;
	/*方法重载：
	 * 1.方法名相同
	 * 2.参数列表不同（参数个数，或类型，或顺序的不同）
	 * 3.与返回值和权限修饰符无关
	 * 
	 * */
	public Car()
	{
		System.out.println("无参数的构造方法...");
	}
	public Car(String name){
		this();
		System.out.println("一个参数的构造方法..");
		this.name = name;
	}
	public Car(String name,int age,String color){
//		this();
		this(name);
		this.color = color;
		System.out.println("两个参数的构造方法 ...");
	}
	public Car(String color,String name,int age){
//		this();
		this(name);
		this.color = color;
		System.out.println("两个参数的构造方法 ...");
	}
	
	public void driver()
	{
		
	}
	 
	public void driver(String country)
	{
		
	}
	
	public String toString()
	{
		return "name="+name+",color="+color;
	}
	
}
