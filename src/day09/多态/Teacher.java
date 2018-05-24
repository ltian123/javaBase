package day09.多态;

public class Teacher extends Person{
	double salary;
	String name;
	public Teacher()
	{
		
	}
	public Teacher(String name){
		super.name = name;
	}
	public void say()
	{
		System.out.println("教学中....,就不要吃了吧");
	}
	
	public void education()
	{
		System.out.println("春蚕到死丝方尽.....");
	}
}
