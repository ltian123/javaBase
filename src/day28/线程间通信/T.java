package day28.线程间通信;

public class T implements Runnable{

	@Override
	public void run() {
		System.out.println("wait发出前....");
		synchronized(this){
			System.out.println("进入同步代码块....");
			try {
				//开始等待
				this.wait();
				System.out.println("wait后...");
			} catch (InterruptedException e) {
			}
		}
	}

}
