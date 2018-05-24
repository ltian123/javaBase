package day09.多态;

public class Ghost {
	public static Person getPerson(int choice){
		Person p = null;
		switch(choice){
		case 0:
			return new Teacher("徐娅...");
			
		case 1:
			 return new BadStudent("拾凯...");
		}
		return p;
	}
	public static void eatPerson(Person p){
		p.say();
		System.out.println("正在吃"+p.name+"....");
	}
}
