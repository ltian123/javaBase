package day21.定时器;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		/*一秒后执行mytask中的任务，每隔2秒执行一次*/
		timer.schedule(new MyTask(), 500, 1000);
	}
}
class MyTask extends TimerTask{
	public static int i = 0;
	
	public void run() {
		System.out.println((i++)+"个田七");
		if(i<0){
			this.cancel();
			System.exit(0);
		}
	}
}