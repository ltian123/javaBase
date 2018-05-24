package day11.字符串处理;
/*字符串的编码：将字符串转换为字节数组叫编码
 *字符串的解码：将字节数组转为字符串叫解码 
 * 
 * */
public class 字符串编码 {
	public static void main(String[] args)throws Exception {
		String s = "我是ca";
		//把字符串转字节数组
		byte[]b = s.getBytes("gbk");
		System.out.println(b.length);
		for(int i = 0;i<b.length;i++){
			System.out.println((char)b[i]);
		}
		
		//把字节数组转字符串
		String s0 = new String(b,"gbk");
		System.out.println(s0);
		
	}
}
