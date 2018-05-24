package day09.作业;
/*定义一个类，要求能构实现查询该类一共创建了多少个实例对象？*/
class Person
{
	//用于统计该类一共创建了多少个实例
	/*在加载一个类时，会先给该本的静态属性初始化，然后再执行静态代码块*/
	static int num=show();
	static{
		System.out.println("静态代码块");
	}
	
	static int show()
	{	
		System.out.println("这是show方法 ");
		return 0;
	}
	
	{
		num++;
	}
}


public class Demo1 {
	public static void main(String[] args)throws Exception {
		Class.forName("day09.作业.Person");
		Person p = null;
		for(int i = 0;i<100;i++){
			p = new Person();
		}
		System.out.println("一共创建了"+Person.num+"对象");
	}
}
