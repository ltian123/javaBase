package day27.线程组;

public class Test {
	public static void main(String[] args) {
		T t1 = new T();
		T t2 = new T();
		T t3 = new T();
		
		ThreadGroup tg = new ThreadGroup("线程组");
		
		
		Thread th1 = new Thread(tg,t1,"线程一");
		Thread th2 = new Thread(tg,t2,"线程二");
		Thread th3 = new Thread(tg,t3,"线程三");
		
		th1.setPriority(9);
		
		tg.setMaxPriority(4);
		th1.start();
		th2.start();
		th2.start();
		
	}
}
