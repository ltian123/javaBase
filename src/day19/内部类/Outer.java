package day19.内部类;

public class Outer {
	static String outName = "out";
	String name;
	int age;
	public Outer(String name,int age){
		this.age = age;
		this.name = name;
	}
	public Inner get(){
		
		return new Inner();
	}
	
	public class Inner
	{
		String abc;
		String name = "in";
		int age;
		public void show()
		{
			System.out.println(name);
			System.out.println(outName);
			//下面为解决内部类与外部类属性重名问题
			System.out.println("外部类的age="+Outer.this.age);
		}
	}
	
}
