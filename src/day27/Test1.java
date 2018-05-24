package day27;

public class Test1 {
	public static void main(String[] args) {
		JoinDemo jd = new JoinDemo();
		Thread th1 = new Thread(jd,"子线程");
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e1) {
			
		}
		int i = 0;
		while(i<100){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName()+":"+i++);
		}
		
	}
}
