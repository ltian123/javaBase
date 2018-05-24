package day10.多态;

public class Test {
	public static void main(String[] args) {
		Person p = new Student();
		Test t = new Test();
//		new Test().method1(p);
		t.method1(p);
		t.method1(new Doctor());
	}
	//形参p为多态
	void method1(Person p)
	{
		p.say();
//		if(p instanceof Student){
//			((Student)p).play();
//		}else{
//			((Doctor)p).myLove();
//		}
	}
	Student method2(int mode)
	{
		
			return new Student();
		
	}
	Doctor method3(int mode)
	{
		
			return new Doctor();
		
	}
}
