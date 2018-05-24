package day11.字符串处理;

public class 字符串常量池 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s4==s3);
		
		s1 = "xyz";
		s2 = "xyz1";
		//s1是变量，运行时才能知道具体值，因此其不是字符串常量，也不在常量池中
		s3 = s1+1;
		System.out.println(s2==s3);
	}
}
