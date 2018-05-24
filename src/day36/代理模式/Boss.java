package day36.代理模式;

public class Boss implements SecretaryI{
	private SecretaryI delegate;
	public Boss(SecretaryI delegate){
		this.delegate = delegate;
	}
//	public void eat()
//	{
//		((Secretary)delegate).eat();
//	}
	@Override
	public void buyTicket() {
		if(delegate!=null){
			delegate.buyTicket();
		}else{
			System.out.println("你只能自己去买...");
		}
	}
	

}
