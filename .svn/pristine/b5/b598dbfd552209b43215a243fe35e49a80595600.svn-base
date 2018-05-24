package day35;
import java.util.*;
/*注意：
 * 1.任何指定了泛型类型的对象与不指定泛型的对象之间，是可以相互赋值的
 * 2.指定了泛型后，如果类型不相同，则无法直接赋值
 * 
 * */
public class Test {
	public static void main(String[] args) {
		Demo t1 = new Demo("abc");
		System.out.println(t1.getValue());
		ArrayList <String>arr = new ArrayList<String>();
		Demo<String>t2 = new Demo<String>("123");
		System.out.println(t2.getValue());
		
		Demo<Integer>t3 = new Demo<Integer>(20);
		Demo<Integer>t4 = new Demo<Integer>(50);
		t4 = t3;
		
		t1 = t4;
		t3 = t1;
		
//		t2 = t3;错误
//		t2 = (Demo)t3;
	}
}
