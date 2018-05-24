package day28.ThreadLocal的使用;

import java.util.Random;

public class ThreadDemo implements Runnable{
	ThreadLocal s = new ThreadLocal();
	
	Student getStudent()
	{
		/*ThreadLocal中有一个hashmap,在get()时，本质上就是
		 * 能过key获取value,默认的key是Thread.currentThread()
		 * */
		Student stu = (Student)s.get();
		//线程首次执行此方法时，得到的值一定为null
		if(stu==null){
			stu = new Student();
			s.set(stu);
		}
		
		return stu;
	}
	
	
	public void run() {
		//获取当前线程名字
		String name = Thread.currentThread().getName();
		System.out.println(name+"正在运行...");
		
		Random random = new Random();
		int age = random.nextInt(100);
		System.out.println(name+"产生的随机age为"+age);
		
		Student stu = getStudent();
		stu.setAge(age);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(name+"的age="+stu.getAge());
	}
	
	public static void main(String[] args) {
		ThreadDemo d = new ThreadDemo();
		Thread t1 = new Thread(d,"a");
		Thread t2 = new Thread(d,"b");
		
		t1.start();
		t2.start();
	}
}
