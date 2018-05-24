package day17.集合的遍历;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Vector <Integer>v = new Vector<Integer>();
		v.add(1);
		v.add(3);
		v.add(34);
		v.add(12);
		
		v.remove(new Integer(1));
		m5(v);
	}
	//第一种
	static void m1(Vector <Integer>v){
		for(int i = 0;i<v.size();i++){
			System.out.println(v.get(i));
		}
	}
	//第二种
	static void m2(Vector <Integer>v){
		for(Object o:v){
			System.out.println(o);
		}
	}
	/*第三种：使用Enumeration，适用于Vector,Hashtable,Properties*/
	static void m3(Vector <Integer>v){
		Enumeration <Integer>e = v.elements();
		//判断是否还有元素
		while(e.hasMoreElements()){
			//获取当前位置的元素,同时指针会向后自动走一个位置
			Integer o = e.nextElement();
			System.out.println(o);
		}
	}
	//第四种：迭代器
	static void m4(Vector <Integer>v)
	{
		Iterator it = v.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}
	//第五种：
	static void m5(Vector <Integer>v)
	{
		System.out.println(v);
	}
	
}
