package day28.线程.方法同步;

public class Sell implements Runnable{
	static int sum = 100;
	@Override
	public void run() {
		while(true){
			if(sum>0){
				sell();
			}else{
				break;
			}
		}
	}
	/*方法同步时，如果是静态方法，锁是当前类对象，如果是实例方法，锁是this*/
	 synchronized void sell()
	{
		if(sum<=0){
			return;
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+"卖出第"+sum+"张票");
		sum--;
	}
}
