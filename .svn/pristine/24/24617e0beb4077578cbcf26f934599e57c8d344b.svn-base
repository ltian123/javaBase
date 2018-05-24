package day35.反射;

import java.lang.reflect.Modifier;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Test t = new Test();
		//1.
		String str = new String("aaa");
		Class c1 = str.getClass();
		
		//2.
		Class c2 = Class.forName("java.lang.String");
		//3.
		Class c3 = String.class;
		
		System.out.println(c3==c2);
		int m = c1.getModifiers();
		modify(m);
		getProperty(Test.class);
	}
	
	//获取class对象的属性
	public static void getProperty(Class c){
		System.out.println("类名："+c.getName());
		System.out.println("简化类名："+c.getSimpleName());
		System.out.println("包名："+c.getPackage());
		System.out.println("是否为接口："+c.isInterface());
	}
	
	public static void modify(int m){
		System.out.println("该类是公有的吗？"+Modifier.isPublic(m));
		System.out.println("是抽象类吗？"+Modifier.isAbstract(m));
		System.out.println("是私有的吗？"+Modifier.isPrivate(m));		
	}
}
