package day28.线程间通信.生产与消费;

public class Producer implements Runnable{
	Factory f = null;
	public Producer(Factory f){
		this.f = f;
	}
	@Override
	public void run() {
		while(true){
			f.produce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
