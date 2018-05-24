package day27.线程同步;

public class SellTicket implements Runnable {
	private static int sum = 100;
//	/*产生线程锁*/
//	Object obj = new Object();

	//有问题的代码
	public void run1() {
		while (sum > 0) {			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName()+"卖出票为："+sum);
			
			sum--;
		}
	}
	
	public void run() {
		while (true) {
			synchronized(SellTicket.class){
				if(sum>0){
					System.out.println(Thread.currentThread().getName()+"卖出票为："+sum);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
					sum--;
				}else{
					break;
				}
			}
						
		}
	}
}
