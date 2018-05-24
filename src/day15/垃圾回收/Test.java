package day15.垃圾回收;

/*当一个对象没有一个引用变量指向它时，该对象就可以被虚拟机回收
 * 注意：当对象的堆内存在没有被引用时，虚拟机会在适当的时候销毁掉这块对象地址
 * */
public class Test {
	public static void test(String[] args) {
		Dog m = null;
		m(m);
		System.out.println("xxxx");
	}
	static void m(Dog n)
	{
		Dog d = new Dog(1);
		n = d;
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog(1);
		Dog d2 = new Dog(2);
		Dog d3 = new Dog(3);
		d2 = d3 = null;
		Dog d = null;
		for(int i = 0;i<100000;i++){
			d = new Dog(i);
		}
		d = null;
	}
	
}
class Dog
{
	private int id;
	public Dog(int id){
		this.id = id;
		System.out.println("dog object "+id+" is created!");
	}
	//当一个对象将要被回收前一定会调用该方法 
	protected void finalize()throws Throwable{
		super.finalize();
		System.out.println("dog object "+id+" is disposed!");
	}
}
class Cat
{
	
}