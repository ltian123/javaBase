package day03.循环语句;

public class Test2 {
	public static void test(String[] args) {
		int sum1 = 0;//奇数
		int sum2 = 0;//偶数
		for(int i = 1;i<=100;i++){
			if(i%2==0){
				sum2 = sum2+i;
			}else{
				sum1 +=i;
			}
		}
		System.out.println("奇数和为："+sum1+",偶数和为："+sum2);
	}
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			for(int j = 0;j<5;j++){
				for(int k = 0;k<2;k++){
					System.out.println("i="+i+",j="+j);
				}
				
			}
		}
	}
}
/*有1，2，3，4这四个数字，问能组成多少个互不相同且无重复位的三位数？分别是多少？
 * 
 * 
 * */
