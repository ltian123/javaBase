package day09.多态;

public class Person {
	String name;
	protected void say()
	{
		System.out.println("人类的say...");
	}
	public Person()
	{
		
	}
	public Person(String name)
	{
		this.name = name;
	}
}
