package day18.HashMap使用;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("139138", "杨楚含");
		map.put("132", "养出汉");
		map.put("120", "杨文广");

		System.out.println("是否包含121?" + map.containsKey("121"));
		System.out.println("是否包含可以杨楚含？" + map.containsValue("杨楚含"));
		map.remove("132");
		Set<Map.Entry<String, String>> set = map.entrySet();
		/*
		 * o实现了接口Map.Entry，m = new O();
		 */
		// for(Map.Entry<String, String>m:set){
		// System.out.println(m.getKey()+":"+m.getValue());
		// }

		// 获取map中键值对的个数
		System.out.println(map.size());
		
		// 通过key得到value
		String v = map.get("120");
		System.out.println(v);
		Set<String> set1 = map.keySet();
		for(String s:set1){
			System.out.println(s+":"+map.get(s));
		}
		System.out.println("==================");
		Collection <String>col = map.values();
		for(String str:col){
			System.out.println(str);
		}
	}
}
