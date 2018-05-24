package day07.面向对象.demo2;

public class Account {
	double money;
	String bankName;
	public void saveMoney(Atm atm,int m){
		if((atm.bankName.equals(bankName))&&m>0){
			money = money+m;
		}else{
			System.out.println("非本银行或金额错误!");
		}
		queryMoney();
	}
	
	public void getMoney(Atm atm,int m)
	{
		if(m>money){
			System.out.println("余额不足！");
		}else{
			if(atm.bankName.equals(bankName)){
				money-=m;
			}else{
				//跨行取钱
				if(m*1.01>money){
					System.out.println("余额不足！");
				}else{
					money=money-m*1.01;
				}
			}
			queryMoney();
		}
	}
	public void queryMoney()
	{
		System.out.println(bankName+"帐户余额为："+money);
	}
}
