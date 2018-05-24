package day12.字符串与基本类型;

public class Test {
	public static void main(String[] args) {
		/*把基本数据类型转字符串*/
		//1.
		String s = 10+"";
		s = 'a'+"";
		s = 10.0+"";
		s = 10.0f +"";
		s = true+"";
		
		//2.
		s = String.valueOf(true);
		s = String.valueOf(10.0f);
		
		//3.
		int x = 10;
//		Integer in = null;
//		in.toString();
		s = Integer.toString(x);
		
		System.out.println(s);
		
		/*把字符串转基本数据类型*/
		String n = "10.1";
		//方法1：
//		int num1 = Integer.parseInt(n);
		double d = Double.parseDouble(n);
		
		//方法二：
		d = Double.valueOf(n);
		Integer.valueOf(s);
		System.out.println(d);
		
	}
}
