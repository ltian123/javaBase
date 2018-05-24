package day17;
import java.util.*;
public class HashSet的使用 {
	public static void main(String[] args) {
		/*HashSet中的元素顺序无法保证*/
		HashSet <String>hs = new HashSet<String>();
		
		hs.add("赵云");
		hs.add("陆文龙");
		hs.add("罗成");
		
		hs.add("罗成");
		
		Iterator <String>it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("罗成"));
		
	}
}
