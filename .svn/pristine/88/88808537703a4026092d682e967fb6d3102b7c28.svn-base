package day26.线程;

public class MyThread implements Runnable{
	private int count;
	public MyThread(int count){
		this.count = count;
	}
	@Override
	public void run() {
		while(count>0){
			/*从running状态进入runable状态*/
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+count--);
		}

	}

}
