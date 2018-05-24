package day08.构造方法;

public class Student {
	String address;
	String name;
	private int age;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*如果定义一个类时，没有定义构造方法 ，则系统会默认提供下面构造方法
	 * 但是如果我们自已定义了一个带参数的构造方法，则系统不再默认
	 * 提供无参构造方法 */
//	public Student()
//	{
//		address = "南京";
//		System.out.println("无参的构造方法 ");
//	}
	public Student()
	{
		
	}
	public Student(String name,int age,String address)
	{
		//调用无参数的构造方法,而且必须出现在当前构造方法的第一行
//		this();
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("有参数的构造方法");
	}
	
}
