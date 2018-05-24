package day19.作业;
/*/*先定义一个学生类：name,age，
 * 比如：s1("张三“，23)
 * hs.put(s1.name,s1)
 * 一个hashMap中放的key是学生的姓名，value是学生对象本身 
 * 要求用三种方法遍历出学生姓名和年龄
 * */

public class Student {
	String name;
	int age;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "name="+name+",age="+age;
	}
}
