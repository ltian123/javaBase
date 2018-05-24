package day15;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * 1.定义方法，实现把字符串格式的时间("2015-11-21")转为long类型的数字，
2.定义方法，实现把long类型的时间转为date:   new Date() ,这里要用自定义异常处理,
 * */
import java.util.*;
public class 作业1 {
	public static void main(String[] args) {
		try {
			stringToLong("2015-5-8 12:23:34");
		} catch (DateFormatException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
	public static void longToDate(long time){
		Date date = new Date(time);
	}
	public static void stringToLong(String date)throws DateFormatException{
		Date time = null;
		try {
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(date);
			System.out.println("时间转换后的毫秒数为："+time.getTime());
		} catch (ParseException e) {
			throw new DateFormatException("字符串格式错误！",e);
//			throw new NullPointerException();
		}
	}
}

class DateFormatException extends Exception
{
	//第二个参数是指明本次异常的出现是因为t这个异常造成的
	public DateFormatException(String s,Throwable t)
	{
		super(s,t);
	}
}