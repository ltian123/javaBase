package day11.字符串处理;

public class 练习 {
	public static void main(String[] args) {
		String s1 = new String("abc");//1
		String s2 = "abc";//2
		String s3 = "ab"+"c";//4
		System.out.println(s2==s3);
		String s4 = "ab";//4
		String s5 = "c";//4
		String s6 = s4+s5;//5
		System.out.println(s3==s6);//false
		
		s1.substring(1);//6个
		
	}
}
