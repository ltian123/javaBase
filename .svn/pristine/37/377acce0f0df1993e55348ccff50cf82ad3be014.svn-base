package day27.守护线程;

public class SellBook implements Runnable{
	boolean open = true;
	//用来关闭书店
	public void close()
	{
		this.open = false;
	}
	public SellBook(int bookNum){
		BookLib.bookNum = bookNum;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(open){
			if(BookLib.bookNum>0){
				System.out.println(name+":卖出第"+BookLib.bookNum--+"本书");
			
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			
			}
		}
	}

}
