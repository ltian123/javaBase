package day29;

public class ThreadAdd extends Thread{
	StringB a;
	public ThreadAdd(StringB a){
		this.a = a;
	}
	public void run()
	{
		while(true){
			a.add();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
