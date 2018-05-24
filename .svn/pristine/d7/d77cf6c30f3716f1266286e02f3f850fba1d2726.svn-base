package day28.线程间通信.生产与消费;

public class Test {
	public static void main(String[] args) {
		Factory f = new Factory();
		new Thread(new Producer(f),"生产者A").start();
		new Thread(new Consumer(f),"消费者A").start();
		
		
	}
}
