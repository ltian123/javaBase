package day27.优先级;

public class Test {
	public static void main(String[] args) {
		T t = new T();
		Thread th1 = new Thread(t,"A");
		th1.setPriority(9);
		th1.start();
		
		Thread th2 = new Thread(t,"B");
		th2.setPriority(1);
		th2.start();
		
		System.out.println(Thread.MAX_PRIORITY);
	}
}
