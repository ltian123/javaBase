package day13.接口和抽象类;
/*接口：用来描述不同类型事物的一种方式，用interface修饰
 *接口特点：
 *	接口中的方法是public权限，属性全是public static final型的属性
 *	接口中只能定义抽象方法
 *	接口中没有构造方法，也不能被实例化
 * 	接口的实现类必须实现接口的所有方法（如果实现类为抽象类，则不用实现全部方法）,实现类可以实现多个接口，用,号隔开
 * 	接口可以继承自其他接口
 * */
public interface Runner {
	int AGE = 30;
	
	void run();
//	static void say();
	
	
}

interface Animal extends Runner
{
	void eat();
}

interface Swimming
{
	void swimming();
}
class Fish implements Animal,Swimming
{
	@Override
	public void eat() {	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
	
}
class C implements Runner
{
	public void run()
	{
		
	}
}
