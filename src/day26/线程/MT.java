package day26.线程;
import java.text.SimpleDateFormat;
import java.util.*;
public class MT implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		MT m = new MT();
		Thread thread = new Thread(m,"我的线程");
		thread.start();
		
		Thread.sleep(300);
		/*在主线程中对子线程发出中断请求*/
		thread.interrupt();
		System.out.println("线程中断已发出...");
	}
	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while(true){
			System.out.println("时间："+sdf.format(new Date()));
			/*在休眠状态下，如果被其他线程发出中断请求，则一定会抛出异常*/
			try{
				Thread.sleep(400);
			}catch(InterruptedException e){
				System.out.println("线程中断已收到");
				return;
			}
		}
	}
	
}
