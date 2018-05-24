package day07.面向对象.demo2;

public class Test {
	public static void main(String[] args) {
		Atm atm1 = new Atm();
		atm1.bankName = "招行";
		
		Atm atm2 = new Atm();
		atm2.bankName = "中行";
		
		Person person = new Person();
		person.account = new Account();
		
		person.account.bankName = "招行";
		
		person.account.saveMoney(atm1, 100);
		
		person.account.getMoney(atm2, 50);
		
		person.account1 = new Account();
	}
}
