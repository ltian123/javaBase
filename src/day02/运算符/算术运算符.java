package day02.运算符;

public class 算术运算符 {
	public static void main(String[] args) {
		/*算术运算符：+，-，*，/,%,++,--*/
		int a = 25;
		double b = 10;
		double z = a+b;
		z = a-b;
		z = a*b;
		/*/前后如果全是整数，则该 算法是取整，如果两边有一方是符点数，则是除法*/
		z = a/b;
		/*下面是取余数,最好两个表达式全是整数*/
		double z1 = a%b;
		
		int k = 0;
		int i = 10,j = 12;
		//i++ 等价于 i=i+1;
		k = i++;//i = 11
		k = ++i;//i = 12
		k = i--;//i = 11
		k = --i;//i = 10
		System.out.println("k="+k+",i = "+i);
	}
	
	
	
}
