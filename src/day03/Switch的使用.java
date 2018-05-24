package day03;

public class Switch的使用 {
	public static void main(String[] args) {
		int a = 1;
		
		/*switch小括号中的可以是整数(byte,int,short,char,枚举,String)*/
		switch(a){
		case 1:
			System.out.println("a=1");
			
		case 2:
			System.out.println("a=2");
			
		case 3:
			System.out.println("a=3");
			
			default:
				System.out.println("a="+a);
		}
	}
	/*输入某年某月某日，判断这一天是这一年的第几天
	 * 
	 * 
	 * */
}
