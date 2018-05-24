package day14.枚举的使用;
/*枚举的好处：
 * 1.增强代码可读性
 * 2.限定数据的赋值类型和数据范围
 * */

/*1.定义一个季节枚举Season：春、夏、秋、冬;给该枚举类
 * 	定义一个int 成员变量，一个参数的构造方法用于初始化成员变量
 *2.定义Test类，产生一方法public String getSeason(Season season),
 *	在该方法中用switch解析出参数传进来的是什么季节，并返回字符形式,比如：season为Spring,
 *则返回：现在是春天
 * 
 * 
 * */
enum Season
{
	SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);
	 int code;
	 Season(int code){
		this.code = code;
	}
}
public class Test3 {
	public static String getSeason(Season season){
		switch(season){
		case SPRING:
			return season.name()+":现在是春天，code="+season.code;
		case SUMMER:
			return season.name()+":现在是夏天，code="+season.code;
		case AUTUMN:
			return season.name()+":现在是秋天，code="+season.code;
		case WINTER:
			return season.name()+":现在是冬天，code="+season.code;
		}
		
		return null;
	}
	public static void main(String[] args) {
		String s = getSeason(Season.SPRING);
		System.out.println(s);
	}
}
