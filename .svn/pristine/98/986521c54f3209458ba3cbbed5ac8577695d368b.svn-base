package day07.面向对象.demo4;

public class Stu {
//	Dog d1;
//	Dog d2;
//	Dog d3;
//	int[]d = new int[3];
	Dog[]d = new Dog[3];
	String address;
	int age;
	String name;
	/*构造方法特点：
	 * 1.一般访问权限为public
	 * 2.没有返回值类型
	 * 3.名字跟类名保持一致
	 * 
	 * */
	public Stu()
	{
		System.out.println("在调用无参的构造方法 ....");
		address = "中南海";
		age = 180;
		name = "老毛";
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address){
		//this是什么？是对象，是哪个对象？哪个实例对象调用，则this就是哪个对象
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	
	void abc()
	{
		System.out.println("name="+name+",age="+age+",address="+address);
	}
}
