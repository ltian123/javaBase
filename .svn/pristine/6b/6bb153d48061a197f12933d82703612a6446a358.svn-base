package day13.接口和抽象类;
/*抽象类：用abstract修饰的类叫抽象类
 * 	特点：
 * 		1.抽象类中可以包含抽象方法,也可不包含抽象方法 
 * 		2.抽象类不可被实例化
 * 		3.抽象类中的构造方法用来给属性初始化
 * */
abstract public class A {
	abstract void m();
	 int age ;
	public A()
	{
		age = 10;
		System.out.println("父类A中的构造 ");
	}
	public A(int age)
	{
		System.out.println("A中带参数的构造");
		this.age = age;
	}
}
class B extends A
{

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
	
	public B(int f)
	{
		age = 20;
//		super(f);
		System.out.println("子类B中带参数和构造");
	}
	
}