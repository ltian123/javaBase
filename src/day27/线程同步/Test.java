package day27.线程同步;

public class Test {
	public static void main(String[] args) {
		
		SellTicket sell = new SellTicket();
		//锁对象就用类对象
		new Thread(new SellTicket(),"窗口A").start();
		new Thread(new SellTicket(),"窗口B").start();
		new Thread(new SellTicket(),"窗口C").start();
		new Thread(new SellTicket(),"窗口D").start();
		new Thread(new SellTicket(),"窗口E").start();
		
		//锁对象就用 this
//		new Thread(sell,"窗口A").start();
//		new Thread(sell,"窗口B").start();
//		new Thread(sell,"窗口C").start();
//		new Thread(sell,"窗口D").start();
//		new Thread(sell,"窗口E").start();
	}
}
