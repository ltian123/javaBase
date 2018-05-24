package day08.static的使用;

public class Pig {
	int age;
	String name = "abc";
	//这是静态属性,类变量
	static String hobby;
	/*实例对象的产生过程：
	 * 1.申请堆内存，如果定义属性时有初始化，则初始化属性
	 * 2.调用该类的普通代码块,而且只调用一次
	 * 3.调用构造方法
	 * */
	
	//下面是普通代码块，每次产生对象时，都会先执行该 代码块，之后调用构造方法
	{
		age = 20;
		name = "猪猪侠";
		hobby = "吃了睡";
		System.out.println("普通代码块的调用");
	}
	/*在加载类时调用,且仅调用一次,静态代码块中不可以访问成员变量和实例方法*/
	static
	{
//		age = 34;
		System.out.println("这是静态代码块");
//		show();
	}
	
	public Pig()
	{
		System.out.println("无参数的构造方法");
	}
	public Pig(String name,int age){
		this.name = name;
		this.age = age;
	}
	/*静态方法中不可以访问成员变量和实例方法*/
	public static void sum(int num1,int num2)
	{
		System.out.println(num1+num2);
//		name = "abc";错误
//		show();错误
	}
	
	public void show()
	{
		System.out.println("name="+name+",age="+age+"爱好："+hobby);
	}
}
