package day09.继承;
/*继承的优点：
 * 1.可使代码简洁
 * 2.可创建更为特殊的类型
 * 3.便于维护
 * */

/*子类可以继承父类的哪些成员？
 * public:可以在任意地方访问
 * protected:可以在当前包中访问，也可不在当前包中的子类访问
 * 
 * 1.父类的public,protected,默认的修饰符属性和方法都可被继承并使用
 * 2.父类的private
 * */
public class Animal {
	protected String name;
	private int age;
	 void showInfo()
	{
		System.out.println("name="+name+"\tage="+age);
	}
}
