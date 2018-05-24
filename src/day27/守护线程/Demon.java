package day27.守护线程;
import java.util.*;
public class Demon implements Runnable{
	SellBook sell;
	//书卖完后的操作
	String select;
	public Demon(SellBook sell){
		this.sell = sell;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(true){
			if(BookLib.bookNum<=0){
				System.out.println(name+"发现书已经卖完，要停止销售，请输入close,要继续销售，请输入sell:");
				Scanner in = new Scanner(System.in);
				select = in.nextLine();
				if(select.equals("close")){
					sell.close();
				}else if(select.equals("sell")){
					System.out.println("请输入本次要卖出去书的数量:");
					BookLib.bookNum = in.nextInt();
				}
			}else{
				System.out.println("守护线程正在工作中....");
				try{
					Thread.sleep(50);
				}catch(InterruptedException e){
				}
			}
		}
		
	}

}
