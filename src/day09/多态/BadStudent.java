package day09.多态;

public class BadStudent extends Person{
	public BadStudent(String name){
		this.name = name;
	}
	public void say()
	{
		System.out.println("玩手机中，你讲课声音小点...");
	}
	public void play()
	{
		System.out.println("游戏中,别烦我..");
	}
}
