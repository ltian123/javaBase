package day07.面向对象.demo3;

public class Student {
	private String name;
	private int age;
	private String sex;
	/*封装之set方法特点：
	 * 1.权限一般为public,返回值void
	 * 2.名字为setXxx();
	 * 3.参数为属性的类型保持一致
	 *get方法特点：
	 	1.权限一般为public,返回值跟属性保持一致
	 * 2.名字为getXxx();
	 * 3.没有参数
	 * */
	public void setAge(int age){
		this.age =  age;
		return;
		
	}
	public int getAge(){
		return age;
	}
	
	
	public void show()
	{
		System.out.println("name="+name+",age="+age+",sex="+sex);
	}
}
