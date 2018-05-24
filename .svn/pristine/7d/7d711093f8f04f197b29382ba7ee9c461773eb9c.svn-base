package day36.单例模式;
/*饿汉模式：
 * 	优点：安全性可保证
 * 	缺点：一开始加载类就要产生一个实例对象，所以性能低*/
public class Single1 {
	private static final Single1 instance = new Single1();
	private Single1()
	{
	}
	/*下面方法用来产生实例对象，单例*/
	public static Single1 getInstance()
	{
		return instance;
	}
}
/*饱汉模式：
 * 	优点：性能高
 * 	缺点：在多线程中安全性低
 * */
class Single2 {
	private static Single2 instance;
	private Single2()
	{
		
	}
	/*下面方法用来产生实例对象，单例*/
	public static Single2 getInstance()
	{
		if(instance==null){
			instance = new Single2();
		}
		return instance;
	}
}
/*第三种：
 * 优点：线程安全
 * 缺点：在多个线程调用getInstance方法时，必须排除，所以性能低*/
class Single3 {
	private static Single3 instance;
	private Single3()
	{
		
	}
	/*下面方法用来产生实例对象，单例*/
	public  static synchronized Single3 getInstance()
	{
		if(instance==null){
			instance = new Single3();
		}
		return instance;
	}
}

/*第四种：
 * 优点：在时空两方面性能都是完美的
 * 缺点：可读性方面有点不易懂
 * */
class Single4 {
	private static Single4 instance;
	private Single4()
	{	
	}
	/*下面方法用来产生实例对象，单例*/
	public  static Single4 getInstance()
	{
		if(instance==null){
			synchronized(Single4.class){
				if(instance==null){
					instance = new Single4();
				}
			}
		}
		return instance;
	}
}