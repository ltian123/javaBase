package day29;

public class ThreadDelete extends Thread{
	StringB a;
	public ThreadDelete(StringB a){
		this.a = a;
	}
	public void run()
	{
		while(true){
			a.delete();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}