package day18;
import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new Stu("A",20,100));//A
		t.add(new Stu("B",21,67));//B,A
		t.add(new Stu("C",12,87));//C,B,A
		System.out.println(t);	
	}
}
class Stu implements Comparable
{
	String name;
	int age;
	int score;
	public Stu(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString()
	{
		return "name="+name+",age="+age+",score="+score;
	}
	@Override
	//this是待添加元素，o是集合中已经存在的某个元素
	public int compareTo(Object o) {
		Stu s = (Stu)o;
		int rs = name.compareTo(s.name);
		if(rs!=0){
			return rs;
		}
		
		rs = age-s.age;
		if(rs!=0){
			return rs;
		}		
		return score-s.score;
	}
}