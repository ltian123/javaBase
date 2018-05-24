package day13;
import java.text.*;
import java.util.*;
/*Date:
 *SimpleDateFormat:用于格式化时间
 *Calendar:用来处理日期相关的类 
 * */
public class 常用类 {
	public static void test(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);
		//参数中的字母是固定写法，MM表示月份，mm表示分钟，hh表示12小时制，HH表示24小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//把日期转为指定格式字符串
		String s = sdf.format(d);
		System.out.println(s);
		//把字符串转为date,比如：2008年07月28日 11:13:13
		
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dd.parse("2008年07月28日");
		System.out.println(d1);
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 1);
		System.out.println("年："+c.get(Calendar.DATE));
		Date d = new Date();
		c.setTime(d);
		//获取当前日历距离格林威治时间过了多少毫秒
		long x = c.getTimeInMillis();
	}
}
