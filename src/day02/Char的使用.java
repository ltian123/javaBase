package day02;

public class Char的使用 {
	public static void main(String[] args) {
		/*A的ascii码值为65
		 *a的ascii码值 为97
		 *小写字母比对应的大写字母大32
		 * */
		char c1 = 'A'+32;
		char c2 = 65;
		//1*1+4*16
		char c3 = 0x041;
		/*0x10F
		 * 1 = 0001
		 * */
		char c4 = '\u0101';
		//字符1一定比字符0大1
		char c5 = '0';
		char c6 = '9';
		
		char c7 = '\n';
		char c8 = '\t';
		char c9 = '\'';
		char c10 = '\\';
		
		System.out.println("aa"+c7+c5);
	}
}	
