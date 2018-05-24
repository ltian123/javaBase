package day11.字符串处理;

public class Demo3 {
	public static void main(String[] args) {
		String st = "I'A,amnam!";
		//判断一个字符在字符串中是否出现过，如果出现则返回位置，没出现则返回负数
		int i1 = st.indexOf('f');
		//从下标为3的位置开始查找，同时包括3位置的字符
		i1 = st.indexOf('a',3);
		i1 = st.indexOf("am");
		//从下标为3的位置开始查找，同时包括3位置的字符串
		i1 = st.indexOf("am",3);
		
		st.contains("am");
		//从后面开始查找某字符或字符串出现位置
		i1 = st.lastIndexOf('a');
		//从下标为3的位置开始倒着查找
		i1 = st.lastIndexOf('a',3);
		System.out.println(i1);
		//判断字符串是否为空字符串
		System.out.println(st.isEmpty());
		//字符串或字符的替换 
		System.out.println(st.replace('a','A'));
		System.out.println(st.replace("am","哈哈"));
		
		//字符串截取,从下标为2开始
		System.out.println(st.substring(2));
		System.out.println(st.substring(2, 4));
		//全部转为大写或小写
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st);
	}
}
