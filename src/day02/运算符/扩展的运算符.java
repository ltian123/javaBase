package day02.运算符;

public class 扩展的运算符 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		a+=b;//a = a+b
		
		a-=b;//a = a-b
		a*=b;//a=a*b;
		a/=b;
		a%=b;
		
		a+=b+20;//a=a+(b+20)
		a = 10;
		System.out.println(a);
		int c = a<b?a:b;
		System.out.println(c);
		
		String s = "ABC:";
		s = s+a;
		System.out.println(s);
	}
}
