package day09.继承2;

public class Dog extends Animal {
	String hobby;
	int age;
	public Dog()
	{
		System.out.println("子类Dog无参的构造方法");
	}
	public Dog(String name,int age,String sex)
	{
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
		/*调用父类中的构造方法*/
		super(name,age,sex);
		System.out.println("子类Dog三个参数的构造方法");
	}
	public Dog(String name,int age,String sex,String hobby)
	{
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
		/*调用父类中的构造方法,在构造方法中，通过this或super调用构造方法时，只能用一个
		 * 而且必须在第一行*/
		this(name,age,sex);
//		super();
		this.hobby = hobby;
		System.out.println("子类Dog四个参数的构造方法");
	}
	
	public void play()
	{
		super.age = 2;
		System.out.println("狗狗正在玩老鼠...");
	}
	public void cry()
	{
		System.out.println("汪汪...");
	}
}
