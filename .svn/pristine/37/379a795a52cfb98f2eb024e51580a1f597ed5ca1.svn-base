package day07.Home;

public class Dog {
	String name;	
}

class Market
{
	Dog[]dog = new Dog[10];
	public Market()
	{
		for(int i = 0;i<dog.length;i++){
			dog[i] = new Dog();
			dog[i].name = "Dog"+(i+1);
		}
	}
}

class Person
{
	String name;
	Market market;
	//三只笼子用来装三只狗,此时d[0],d[1],d[2]全是null
	Dog[]d = new Dog[3];
	
	public void getDog()
	{
		for(int i = 0;i<3;i++){
			int id ;
			do{
				id = (int)(Math.random()*10);
			}while(market.dog[id]==null);
			//此时成功从市场的第id号笼子抱出一只狗，并放入第i个笼子中
			d[i] = market.dog[id];
			//清空市场上的某个笼子
			market.dog[id] = null;
		}
	}
	
	public void show()
	{
		for(int i = 0;i<market.dog.length;i++){
			if(market.dog[i]==null){
				System.out.println((i+1)+"号笼子中的狗被收养了");
			}
		}
	}
}
