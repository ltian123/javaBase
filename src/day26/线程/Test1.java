package day26.线程;

public class Test1 {
	public static void main(String[] args) {
		MyThread t = new MyThread(1000);
		Thread th1 = new Thread(t);
		
		th1.setName("线程一");
		th1.start();
		
//		MyThread t1 = new MyThread(1000);
		Thread th2 = new Thread(t,"线程二");
		
//		th2.setName("线程二");
		th2.start();
		
		new Thread(t,"线程三").start();
	}
}
