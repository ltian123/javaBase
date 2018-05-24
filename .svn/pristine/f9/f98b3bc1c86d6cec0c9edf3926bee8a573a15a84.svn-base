package day14.异常;

import java.io.IOException;

public class Demo4 {
	public static void main(String[] args)  {
		try {
			m(1,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("哈哈.....");
	}
	//如果一个函数抛出的是运行时异常，可以不必声明
	public static void m(int num1,int num2)throws IOException
	{
		num1 = num1/num2;
	}
}
class Child extends Demo4
{
	/*子类重写父类方法时，注意两点：
	 * 1.访问权限要跟父类相同或放宽
	 * 2.抛出的异常要跟父类相同或是父类所抛出异常的子类，如果父类方法抛出的异常比较多，则子
	 * 类方法可以抛出这些异常的一个子集，不能抛出新的异常种类,对于运行时异常没有限制
	 * */
	public static void m(int num1,int num2)throws IOException
	{
		num1 = num1/num2;
	}
}
