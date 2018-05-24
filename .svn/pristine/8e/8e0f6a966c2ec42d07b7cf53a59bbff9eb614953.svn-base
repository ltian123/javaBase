package day28.线程间通信;

public class Test {
	public static void main(String[] args) {
		T t = new T();
		Thread th = new Thread(t);
		th.start();
		
		System.out.println("notify前....");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
		
		synchronized(t){
			//唤醒通过t进行的wait
			t.notify();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
			System.out.println("notify后....");
		}
	}
}
