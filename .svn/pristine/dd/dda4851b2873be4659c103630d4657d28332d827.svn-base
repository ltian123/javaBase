package day27.线程组;

public class T implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		int i = 0;
		while(i<1000){
			System.out.println(name+":"+i+",优先级"+Thread.currentThread().getPriority());
		}
	}

}
