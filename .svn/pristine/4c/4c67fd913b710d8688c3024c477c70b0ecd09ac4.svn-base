package day10.数据传递;
import java.util.*;
public class Test {
	public static void test1(String[] args) {
		int a = 10;
		int b = 20;
//		valueTransfer(a,b);
//		System.out.println("方法外部：a="+a+",b="+b);
		
		Person p1 = new Person(a);
		Person p2 = new Person(b);
//		referenceTransfer(p1,p2);
//		System.out.println("方法外p1.age="+p1.age+",p2.age="+p2.age);
		
		String s1 = new String("abc");
		String s2 = new String("123");
		swap(s1,s2);
		System.out.println("方法外：s1="+s1+",s2="+s2);
	}
	public static void valueTransfer(int x,int y){
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("方法内部：x="+x+",y="+y);
	}
	//交换成功
	public static void referenceTransfer(Person p11,Person p22){
		int tmp = p11.age;
		p11.age = p22.age;
		p22.age = tmp;
		System.out.println("方法内p11.age="+p11.age+",p22.age="+p22.age);
	}
	//交换失败
	public static void swap(String str1,String str2){
		String tmp = str1;
		str1 = str2;
		str2 = tmp;
		System.out.println("方法内部：str1="+str1+",str2="+str2);
	}
	
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'b';
//		swap1(c1,c2);
		char[]arr = {c1,c2};
		swap2(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	//不成功
	public static void swap1(char c11,char c22){
		char tmp = c11;
		c11 = c22;
		c22 = tmp;
		System.out.println("方法内：c1="+c11+",c2="+c22);
	}
	//交换成功
	public static void swap2(char[]ch){
		char tmp = ch[0];
		ch[0] = ch[1];
		ch[1] = tmp;
	}
	
}
