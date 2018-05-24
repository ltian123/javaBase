package day13;
import java.util.*;
import java.text.*;
public class 计算日期 {
	public static void main(String[] args) throws Exception{
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = df.parse("2016/9/15");
		System.out.println("还有天数为："+dayCompute3(d,now));
	}
	
	public static double dayCompute1(Date d1,Date d2){
		long l1 = d1.getTime();
		long l2 = d2.getTime();
		return (l1-l2)/(24*3600*1000.0);
	}
	public static double dayCompute2(Date d1,Date d2){
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		
		return c1.get(Calendar.DAY_OF_YEAR)-c2.get(Calendar.DAY_OF_YEAR);
	}
	public static double dayCompute3(Date d1,Date d2){
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		
		long l1 = c1.getTimeInMillis();
		long l2 = c2.getTimeInMillis();
		
		return (l1-l2)/(24*3600*1000.0);
	}
}
