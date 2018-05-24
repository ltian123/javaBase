package day10.面向对象练习;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Grade grade = new Grade(1,"wbs16072","java高薪班");
		Student s1 = new Student(9527,"拾凯",21,"人妖",grade);
		
		System.out.println("请输入他有几个朋友:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Student[]friends = new Student[num];
		
		for(int i = 0;i<friends.length;i++){
			System.out.println("请输入第"+(i+1)+"位朋友的学号，姓名，年龄，性别，并用逗号隔开：");
			//007,熊大,20,男
			String info = in.next();//用于从键盘获取字符串
			String[]arr = info.split(",");
			//把字符串转为int,parseInt()可以把一个int型的字符串转为int
			int sid = Integer.parseInt(arr[0]);
			String name = arr[1];
			int age = Integer.parseInt(arr[2]);
			String sex = arr[3];
			friends[i] = new Student(sid,name,age,sex,grade);
		}
		
		s1.setFriends(friends);
		
		Student[]ss = s1.getFriends();
		for(Student st:ss){
			System.out.println(st);
		}
		
	}
}
