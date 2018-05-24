package day09.多态;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Person p = null;
		double d = 5;
		p = new Teacher();
//		p.salary = 200;错误
		//多态引用在执行重写方法时，执行的是子类的方法
		p.say();
//		p.education();错误
		
//		((BadStudent)p).play();
		/*instanceof用于判断p是否是右边所属类的实例或其子类的实例*/
		if(p instanceof Teacher){
			((Teacher)p).education();
		}else if(p instanceof BadStudent){
			System.out.println("是学生对象");
		}
		
		
		p = new Teacher("老张");
		System.out.println(p.name);
		
	}
	public static void main1(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你要吃的人种:");
		int choice = in.nextInt();
		Person p = Ghost.getPerson(choice);
		Teacher t = new Teacher();
		Ghost.eatPerson(t);
	}
}
