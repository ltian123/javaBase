package day17.home;
/*1。将键盘上输入的一个字符串中所有的每位数字存储在Vector对象中，然后在屏幕上打印出每一位
	数字相加的结果，比如：输入字符串“a32b”，则把3，2作为integer类型数据放入vector中
	，并打印数字5;
	如果输入的是1234，则打印出10
2.编写一个方法，对于输入的任意一串字符串，要求实现字符串的如下转换：
	如：abcd1234aaattt1-->ABCD-1234-AAAT-TT1
 * 
 * */
import java.util.*;
public class Test {
	public static void test1(String[] args) {
		System.out.println("请输入一个字符串：");
		String s = new Scanner(System.in).next();
		
	}
	public static String change(String s){
		s = s.toUpperCase();
		StringBuffer buffer = new StringBuffer();
		char[]arr = s.toCharArray();
		
		if(arr.length<=4){
			return s;
		}
		
		for(int i = 0;i<arr.length;i++){
			if(i>0&&i%4==0){
				buffer.append("-");
			}
			buffer.append(arr[i]);
		}
		return buffer.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println("请输入一个数字序列：");
		String s = new Scanner(System.in).next();
		
		char[]arr = s.toCharArray();
		int sum = 0;
		Vector <Character>v = new Vector<Character>();
		for(int i = 0;i<arr.length;i++){
			char tmp = arr[i];
			if(tmp<'0'||tmp>'9'){
				continue;
			}
			v.add(tmp);
			sum = sum+(tmp-'0');
		}
		System.out.println("数字和为："+sum);
	}
}
