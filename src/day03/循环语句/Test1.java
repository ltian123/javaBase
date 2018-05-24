package day03.循环语句;

public class Test1 {
	public static void main(String[] args) {
		int i = 0;
		for(;;){
			if(i<10000){
				System.out.println("打击第"+i+"次");
				i++;
			}else{
//				return;//结束的是当前函数的执行
				/*break:在switch中结束switch,在循环语句中结束当前循环语句*/
				break;
			}
			
		}
		System.out.println("i="+i);
	}
}
