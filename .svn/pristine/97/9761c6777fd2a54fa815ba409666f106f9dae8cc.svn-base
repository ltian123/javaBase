package day05;
/*一个5位数，判断它是不是一个回文数，即：12321*/
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		/*1.输入一个五位数字，比如12321*/
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		int num1 = in.nextInt();
		
		int num = new Scanner(System.in).nextInt();
		while(num<10000||num>=100000){
			System.out.println("请输入一个五位数：");
			num = new Scanner(System.in).nextInt();
		}
		
		/*2.定义一个5元素的数组，在for循环中给该 数组中的五个元素赋值*/
		int[]arr = new int[5];
		for(int i = 0;i<arr.length;i++){
			arr[i] = num%10;
			num = num/10;
		}
		
		/*3.在另外一个for循环中判断判断是否满足回文数条件*/
		
		boolean flag = true;
		for(int i = 0;i<arr.length/2;i++){
			if(arr[i]!=arr[arr.length-i-1]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
	}
}
