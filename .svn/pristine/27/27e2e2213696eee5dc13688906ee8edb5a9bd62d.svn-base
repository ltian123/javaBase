package day04;
/*打印输出[0--200]之间能被7整除，但不能被4整除的所有整数，要求每
 * 输出3个换一行，并统计个数
 * 
 * */
public class 练习 {
	public static void main(String[] args) {
		int count = 0;//计录个数
		for(int i = 0;i<=200;i++){
			if(i%7==0&&i%4!=0){
				count++;
				System.out.print(i+"\t");
				if(count%3==0){
					System.out.println();
				}
			}
		}
		System.out.println("共找到"+count+"个满足条件的数字");
	}
}
