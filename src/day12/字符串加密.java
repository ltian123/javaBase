package day12;

public class 字符串加密 {
	public static void main(String[] args)throws Exception {
		/*101
		 *011
		 *======
		 *110
		 *011
		 *=======
		 *101
		 * 
		 * */
		String str = "小电影网址:www.xxx.com";
		int pwd = 999;
		byte[]b = str.getBytes();
		for(int i = 0;i<b.length;i++){
			b[i] = (byte)(b[i]^pwd);
		}
		
		for(int i = 0;i<b.length;i++){
			b[i] = (byte)(b[i]^pwd);
		}
		System.out.println(new String(b,"utf8"));
	}
}
