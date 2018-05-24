package day28.线程间通信.生产与消费;

public class Consumer implements Runnable{
	Factory f = null;
	public Consumer(Factory f){
		this.f = f;
	}
	@Override
	public void run() {
		while(true){
			f.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
