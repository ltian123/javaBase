package day15.酒店管理;

public class Customer {
	String name;
	int IDCard;
	String start;
	int days;
	
	public Customer(String name,int id,String start,int days){
		this.name = name;
		this.IDCard = id;
		this.start = start;
		this.days = days;
	}
	public String toString()
	{
		return "客户:"+name+",身份证："+IDCard+",入住时间："+start+",入住天数："+days;
	}
}
