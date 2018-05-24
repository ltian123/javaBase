package day11.字符串处理;

public class 字符串处理2 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ABC";
		System.out.println(s1.equalsIgnoreCase(s2));
		//仅了解
		s1 = String.format("我是%s,年龄是：%d岁,性别:%c", "Tom",25,'f');
		System.out.println(s1);
		s1 = "我是"+"tom"+",年龄："+25;
		
		s1 = "t";
		
		String[]names = s1.split("");
		System.out.println(names.length);
//		for(String name:names){
//			System.out.println();
//		}
		
		System.out.println(names[0].charAt(0));
		System.out.println(names[1].charAt(0));
	}
}
