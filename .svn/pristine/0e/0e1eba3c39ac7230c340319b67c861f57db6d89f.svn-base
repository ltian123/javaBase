package day25.对象序列化;

import java.io.*;
import java.util.*;
/*对象序列化：把一个在内存中使用的对象写入文件
 *反序列化：从一个文件中还原出一个对象
 *
 *transient:用于修饰属性，该属性的值在序列化时，不会保存进文件中
 * */

public class Test1 {
	public static void main(String[] args) throws Exception {
		write();
		read();
	}

	// 序列化
	public static void write() throws Exception {
		Stu stu = new Stu(9527, "唐伯虎", 23, 180.5);
		Stu stu1 = new Stu(9528, "王宝强", 33, 165.5);

		OutputStream os = new FileOutputStream("d:/work/1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(stu);
		/*{
		 * 	if(stu包含writeObject){
		 * 	{
		 * 		stu.writeObjet(this);
		 * 
		 * 
		 * }else{
		 * 	this.defaultWriteObject();
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }

		 * */
		oos.writeObject(stu1);
		oos.close();
	}

	// 序列化
	public static void write1() throws Exception {
		Stu stu = new Stu(9527, "唐伯虎", 23, 180.5);
		Stu stu1 = new Stu(9528, "王宝强", 33, 165.5);
		
		List<Stu>ls = new ArrayList<Stu>();
		ls.add(stu);
		ls.add(stu1);
		
		OutputStream os = new FileOutputStream("d:/work/1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(ls);
		
		oos.close();
	}

	// 反序列化
	static void read() throws Exception {
		FileInputStream fis = new FileInputStream("d:/work/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Stu s1 = (Stu) ois.readObject();
		Stu s2 = (Stu) ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
	}
	static void read1() throws Exception {
		FileInputStream fis = new FileInputStream("d:/work/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		List<Stu>ls = (List<Stu>)ois.readObject();
		
		Stu s1 = ls.get(0);
		Stu s2 = ls.get(1);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

/*
 * Serializable是一个无方法的接口，对象要序列化必须实现该接口
 */
class Stu implements Serializable {
	private int id;
	String name;

	// 下面两个属性在序列化时都不会把值写入文件
	static int age;
	//
	transient double height;

	public Stu(int id, String name, int age, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	/*在对象序列化时，如果存在下面方法 ，则会调用，不存在不调用
	 * 下面两个方法主要用于私有定制要写入的数据
	 * */
	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		/*写入非静态和非transient属性的值*/
		oos.defaultWriteObject();
		oos.writeDouble(height+1.3);
	}
	
	private void readObject(ObjectInputStream ois)throws Exception{
		ois.defaultReadObject();
		height = ois.readDouble()-1.3;
		
	}
	public String toString() {
		return "id=" + id + ",name=" + name + ",age=" + age + ",height="
				+ height;
	}
}