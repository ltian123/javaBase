package day17;
/*LinkedList特点：
 * 	链式存储，频繁添加、删除元素时效率高
 * */
import java.util.*;
public class LinkedList使用 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.add("abc");
		link.add("java");
		link.add(4);
		//在下标为1的位置添加元素
		link.add(1, "c++");
		//首部添加
		link.addFirst("IOS");
		
		//link.addLast("android");
		//删除头部元素并返回该元素
		Object o = link.remove();
//		Object o = link.removeFirst();
		System.out.println(o);
		//删除尾部
		link.removeLast();
		
		System.out.println(link.get(2));
		System.out.println("==========");
		Iterator it = link.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		System.out.println(link);
	}
}
