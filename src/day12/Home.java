package day12;

public class Home {
	public static void test1(String[] args) {
		String str = " ABc EFg";
		System.out.println(str);
		//去掉字符串前后的空格，中间的空格不会处理
		str = str.trim();
		str = str.toUpperCase();
		String[]arr = str.split(" ");
		str = arr[1]+" "+arr[0];
		System.out.println(str);
	}
	/*"aBc EFg"-->"GFE abc"*/
	public static void main(String[] args) {
		String str = " ABc EFg";
		str = str.trim();
		String[]arr = str.split(" ");
		
		//反转字符串:使用StringBuffer
		StringBuffer sb = new StringBuffer(arr[1]);
		sb.reverse();
		
		String rs = sb.toString().toUpperCase()+" "+arr[0].toLowerCase();
		System.out.println(rs);
	}
}
