package day03;
import java.util.*;
/*判断三角形*/
public class If练习 {
	public static void main(String[] args) {
		/*给出三个数，判断是否能构成三角形*/
		Scanner in = new Scanner(System.in);
		System.out.println("请输入三边值：");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println("a="+a+",b="+b+",c="+c);
		if(a<=0||b<=0||c<=0){
			/*return:提前结束函数的执行*/
			return;
		}
		
		if(!(a+b>c&&a+c>b&&b+c>a)){
			System.out.println("不能构成三角形...");
			return;
		}
		
		/*下面继续判断是否是特殊三角形*/
		if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a)){
			if(a==b||a==c||c==b){
				System.out.println("等腰直角三角形");
			}else{
				System.out.println("直角三角形");
			}
			return;
		}
		
		if(a==b||b==c||a==c){
			if(a==b&&b==c){
				System.out.println("等边三角形");
			}else{
				System.out.println("等腰三角形");
			}
			return;
		}
		System.out.println("只能构成普通三角形");
	}
}
