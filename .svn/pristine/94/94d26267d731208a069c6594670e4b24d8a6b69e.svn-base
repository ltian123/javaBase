package day01;

public class Test1 {
	public static void test() {
		//定义并初始化
		int a1 = 170;
		int a2 = 120;
		System.out.println("a1+a2="+(a1+a2));
		int sum = a1+a2;
		System.out.println("sum="+sum);
	}
	/*局部变量(local variable)的作用域：从定义那行开始，直到代码块结束*/
	public static void main(String[] args) {
		
		test();
		int a1 = 100;
		/*局部变量在使用前必须初始化*/
		int i;
		i = 30;
		System.out.println(i);
		
		{
			int k = 100;
			i = 200;
			i = 300;
		}
		
		//k = 200;错误
	}
}
