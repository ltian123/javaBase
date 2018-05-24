package day18.HashMap使用;
import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Student s1 = new Student(1,"石佳");
		Student s2 = new Student(2,"石头");
		Student s3 = new Student(1,"石猴子");
		Student s4 = new Student(1,"石狮子");
		
		hm.put(s1, "123");
		hm.put(s2, "456");
		hm.put(s3, "789");
		hm.put(s4, "321");
		/*如果两个元素的key相同，则会把value替换旧的value*/
		hm.put(new Student(1,"石狮子"), "8888");
		Set keys = hm.keySet();
		show(keys,hm);
	}
	static void show(Collection c,HashMap hm){
		Iterator it = c.iterator();
		while(it.hasNext()){
			Object key1 = it.next();
			System.out.println(key1+"=="+hm.get(key1));
			//System.out.println(it.next()+"=="+hm.get(it.next()));错误
		}
	}
}
