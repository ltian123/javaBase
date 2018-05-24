package day16.集合;
import java.util.*;
/*集合中的元素全是引用数据类型，没有基本数据类型
 *Vector与Arraylist区别：
 *	1.Vector实现了多线程的同步，但在多线程中效率低
 *	2.在遍历集合时，Vector可以使用枚举，在ArrayList不可以
 *共同点：
 *	都是顺序存储 
 * */
public class ArrayList的使用 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		Vector <Integer>list = new Vector<Integer>();
//		Object []arr = new Object[10];
		list.add(new Integer(3));
		list.add(3);
		//修改某个元素
		list.set(1, 101);
		list.add(23);
		list.add(14);
		list.add(3, 2222);
		
		Collections.sort(list);
		System.out.println("最大元素为："+Collections.max(list));
		System.out.println(list.contains(23));
		System.out.println("是否存在元素140？"+Collections.binarySearch(list, 140));
		//list.remove(new Integer(101));
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
