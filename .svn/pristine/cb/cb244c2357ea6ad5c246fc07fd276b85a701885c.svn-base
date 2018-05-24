package day03;
import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		int a = 5;
		/*101
		 *110
		 *=======
		 *011
		*/
		int b = 6;
		System.out.println(a^b);
		
		int tmp;
		/*定义一个引用类型的变量，用于获取用户在键盘上输入的数据*/
		Scanner in = new Scanner(System.in);
		System.out.println("请给出a的值：");
		/*程序执行到此处会阻塞在这里，等待用户输入数据：*/
		a = in.nextInt();
		System.out.println("请给出b的值:");
		b = in.nextInt();
		System.out.println("当前a="+a+",b="+b);
		/*必须掌握*/
		tmp = a;//a = 45,b = 56
		a = b;//a = 56,b = 56
		b = tmp;//a = 56,b = 45;
		
		//不用中间变量
		a = a+b;
		b = a-b;
		a = a-b;
		//异或
		a = a^b;
		b = a^b;
		a = a^b;
		
	}
}
