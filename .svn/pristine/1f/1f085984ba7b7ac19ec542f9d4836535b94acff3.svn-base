package day11.字符串处理;

public class Test1 {
	public static void main(String[] args) {
		String str1 = "I am superman!";
		String str2 = "I am superman!1";
		//返回字符串有多少个字符
		int length = str1.length();
		System.out.println("字符串长度为："+length);
		
		char c = str1.charAt(3);
		System.out.println(c);
		String s  = "";
		for(int i = 0;i<str1.length();i++){
			c = str1.charAt(i);
			if(c>='a'&&c<='z'){
				c = (char)(c-32);	
			}
			s=s+c;
		}
		System.out.println(s);
		/*比较大小,如果返回值为大于0则s1>s2,如果小于0则s1<s2,==0则内容相等*/
		System.out.println(str1.compareTo(str2));
		//比较内容是否相等
		str1.equals(str2);
		//字符串连接
		String result = str1.concat(str2);
		result = str1+str2;
		
		//用于判断一个小字符串在当前字符串中是否出现过
		boolean b = str1.contains("super");
		System.out.println(b);
		
		//把字符数组转为字符串
		char[]cs = {'a','b','c','d'};
		//result = String.copyValueOf(cs);
		
		result = new String(cs);
		
		result = new String(cs,1,2);
		
		//把字符串转字符数组
		char[]cc = str1.toCharArray();
		for(int i = 0;i<cc.length;i++){
			System.out.print(cc[i]);
		}
	}
}
