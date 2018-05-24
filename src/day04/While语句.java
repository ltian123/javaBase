package day04;

public class While语句 {
	public static void test(String[] args) {
//		int i = 0;
//		while(i<100){
//			System.out.println("钢铁侠"+i);
//			i++;
//		}
//		for(int i = 0;i<100;i++){
//			System.out.println("钢铁侠"+i);
//		}
		
		int i = 0;
		do{
			System.out.println("钢铁侠"+i);
			i++;
		}while(i<100);
	}
	
	public static void test2(String[] args) {
		int i = 1;
		while(true){
			System.out.println(i);
			
			i++;
			if(i>100){
				break;
			}
		}
		System.out.println("循环外面的语句");
	}
	public static void test3(String[] args) {
		int i = 1;
		while(true){
			System.out.println(i);
			if(i%5==0){
				break;
			}
			i++;
			
		}
		System.out.println("循环外面的语句");
	}
	/*带标签的循环语句：求下面程序的运行结果
	 *  i=1,j=0
		i=1,j=1
		i=1,j=2
		i=2,j=0
		i=2
	 * */
	public static void test4(String[] args) {
		int i = 1;
		aoe:for(;i<=10;i++){
			for(int j = 0;j<3;j++){
				System.out.println("i="+i+",j="+j);
				if(i>1){
					break aoe;
				}
			}
		}
		System.out.println("i="+i);
		
	}
	/*continue语句:结束当前本轮的循环，继续下一轮循环
	 *break语句：结束当前的循环语句
	 * */
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			if(i%3==0){
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	
}
