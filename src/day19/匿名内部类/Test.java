package day19.匿名内部类;

public class Test {
//	public static void test(String[] args) {
//		Person p = new Child();
//		p.eat();
//	}
	
	public static void main(String[] args) {
		Person p = new Person(){
			public void eat(){
				System.out.println("三株口服液");
			}
			public void say()
			{
				
			}
		};
		
		p.eat();
		p.say();
	}
}
