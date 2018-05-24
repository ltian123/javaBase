package day14.异常.自定义;
import java.util.*;
public class PasswordException extends Exception{
	public PasswordException(String s)
	{
		//给父类中的一个字符串属性赋值
		super(s);
		System.out.println("密码太短!");
		Date d = new Date("158752414144");
	}
}
