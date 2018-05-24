package day02.运算符;

public class 逻辑运算符 {
	public static void main(String[] args) {
		boolean flag = true;
		//逻辑非
		System.out.println(!flag);
		
		int a = 30;
		int b = 20;
		int c = 20;
		/*逻辑与，当两个表达式全为true才为true,
		 * 当左边为false则会出现短路现象*/
		System.out.println((a>b)&&(a%5==0));
		//逻辑或,当两个表达式全为false才为false
		/*当左边为true则短路*/
		System.out.println(a<b||b++>c);
		
		System.out.println("b="+b);
		
	}
}
