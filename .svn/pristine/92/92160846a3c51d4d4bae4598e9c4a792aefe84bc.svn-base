package day28.线程.方法同步;

public class Test {
	public static void main(String[] args) {
		// 锁对象就用类对象
//		new Thread(new Sell(), "窗口A").start();
//		new Thread(new Sell(), "窗口B").start();
//		new Thread(new Sell(), "窗口C").start();
//		new Thread(new Sell(), "窗口D").start();
//		new Thread(new Sell(), "窗口E").start();
//		
		Sell sell = new Sell();
		new Thread(sell, "窗口A").start();
		new Thread(sell, "窗口B").start();
		new Thread(sell, "窗口C").start();
		new Thread(sell, "窗口D").start();
		new Thread(sell, "窗口E").start();
	}
}
