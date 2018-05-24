package day27.守护线程;

public class Test {
	public static void main(String[] args) {
		SellBook sell = new SellBook(BookLib.bookNum);
		Thread sellThread = new Thread(sell,"风情书店");
		sellThread.start();
		
		//启动精灵线程
		Demon d = new Demon(sell);
		Thread demonThread = new Thread(d,"守护人");
		
		
		//把demon设置为守护线程 
		demonThread.setDaemon(true);
		demonThread.start();
	}
	
}
