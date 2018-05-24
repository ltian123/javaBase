package day25.线程;

public class Test1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		MyThread mt = new MyThread("我的线程");
		mt.start();
		//mt.run();错误，线程启动不可以直接调用run
		
		System.out.println("哈哈");
	}
	
	
}
class MyThread extends Thread
{
	public MyThread(String name){
		//给线程一个名字
		super(name);
		
	}
	
	public void run()
	{
		int i = 10000;
		while(i>0){
			try {
				Thread.sleep(500000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+":"+i--);
		}
	}
}