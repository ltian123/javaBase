package day14.枚举的使用;
enum Course {
	// 下面是枚举成员，其实也是通过该枚举所产生的实例对象
	Java, Android, IOS, UI
}

class Student {
	String name;
	Course course;

	public void show() {
		System.out.println("姓名：" + name + ",课程：" + course);
	}
}

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.course = Course.Java;
		s.show();

		switch (s.course) {
		case Android:
			System.out.println("学习安卓...");
			break;
		case IOS:
			System.out.println("学习IOS");
			break;
		case Java:
			System.out.println("学习java");
			break;
		}
	}
}
