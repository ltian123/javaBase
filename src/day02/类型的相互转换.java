package day02;

public class 类型的相互转换 {
	public static void main(String[] args) {
		int i = 123;
		//容量小的类型自动转换为容量大的类型
		float f = i;
		
		/*byte,short,char之间进行运算时，生产的结果为int类型*/
		byte b1 = 123;
		byte b2 = 4,b3= 5;
		//b3 = b1+b2;错误
		short s = 5;
		//s = s+b1;错误
		char c = 'a';
		//s = c;错误
		//c= c+b1;错误
		/*final修饰的变量只有一次赋值机会*/
		final int AGE;
		AGE = 56;
		
		
	}
}
