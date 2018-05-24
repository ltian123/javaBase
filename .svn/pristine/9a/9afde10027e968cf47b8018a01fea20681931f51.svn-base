package day15.酒店管理;

public class Room {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	//boolean型成员变量的封装，其get方法我们一般用isXXX表示
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	Customer customer;
	boolean empty = true;
	
	public Room(int id){
		this.id = id;
	}
	
	public void in(Customer c){
		if(empty){
			customer = c;
			empty = false;
		}else{
			System.out.println("房间已经有人");
		}
		
	}
	public void out(){
		customer = null;
		empty = true;
	}
	public String toString()
	{
		return "id="+id+",empty="+empty+",customer="+customer;
	}
}
