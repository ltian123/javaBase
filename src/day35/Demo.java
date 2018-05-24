package day35;

public class Demo <T>{
	T t = null;
	public Demo(T t){
		this.t = t;
	}
	public T getValue()
	{
		return t;
	}
	
	public void setValue(T t){
		this.t = t;
	}
}
