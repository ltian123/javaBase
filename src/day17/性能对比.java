package day17;
import java.util.*;
/*编写两个方法分别用于测试ArrayList与LinkedList的效率问题
要求如下：
	定义一个方法，用于向ArrayList中的尾部添加10万个integer类型的数据，并统计用时多少？
	定义一个方法，用于向ArrayList中的头部添加10万个integer类型的数据，并统计用时多少？
	
	定义一个方法，用于向LinkedList中尾部添加10万个integer类型的数据，并统计用时多少？
	定义一个方法，用于向LinkedList中头部添加10万个integer类型的数据，并统计用时多少？
 * */
public class 性能对比 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		compare(arr,true);
		compare(link,true);
		System.out.println("======下面是向尾部添加======");
		compare(arr,false);
		compare(link,false);
	}
	public static void compare(List list,boolean isHead)
	{
		long start = System.currentTimeMillis();
		for(int i = 0;i<=100000;i++){
			if(isHead){
				list.add(0,i);
			}else{
				list.add(i);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("用时："+(end-start)+"ms");
	}
}
