package day12.final关键字;

public   class Animal {
	static final int AGE = 10;
	final String name ;
	static{
		//AGE = 10;
	}
	{
//		name = "";
	}
	public Animal()
	{
		name = "abc";
	}
	public Animal(String a)
	{
		this();
//		name = "abcef";
	}
	public  void  show()
	{
//		AGE = 20;
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		final int age;
		age = 30;
//		age = 40;
		d.show(age);
		
	}
}
class Dog  extends Animal
{
	public void show(final int age)
	{
		System.out.println(age);
//		age = 20;
	}
}