package day26.线程;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("线程 准备开始....");
		ThreadTest t = new ThreadTest();
//		t.setName("线程 一");
		t.start();
		
		ThreadTest t1 = new ThreadTest();
//		t1.setName("线程 二");
		t1.start();
		System.out.println(".....");
		
	}
}
class ThreadTest extends Thread
{
	ThreadTest()
	{
		
	}
	ThreadTest(String name){
		super(name);
	}
	public void run()
	{
		String name = getName();
		name = Thread.currentThread().getName();
		super.run();
		for(int i = 0;i<100;i++){
			
			System.out.println(name+":"+i);
			try {
//				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}