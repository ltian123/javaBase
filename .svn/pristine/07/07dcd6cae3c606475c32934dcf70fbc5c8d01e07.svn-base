package day17;
import java.util.*;
public class 用集合实现一个栈的操作 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("How");
		stack.push(3);
		stack.push("c++");
		stack.push("庄松");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
class MyStack
{
	private LinkedList lk;
	public MyStack()
	{
		lk = new LinkedList();
	}
	public void push(Object s){
		lk.add(s);
	}
	
	//弹出数据
	public Object pop()
	{
		return lk.removeLast();
	}
}