package day03;

public class 条件语句 {
	public static void main(String[] args) {
		int sumScore = 730;
		/*第一种if语句*/
		//if语句后面的条件体如果有多条，则必须加大括号
//		if(sumScore>620)
//		{
//			int a = 30;
//			System.out.println("你可以上北大...");
//			System.out.println("你可以上北大xxxxxx...");
//		}
		
		//第二种
		if(sumScore>620){
			System.out.println("可以上北大...");
		}else{
			System.out.println("来参加java培训...");
		}
		
		//第三种
		if(sumScore>620){
			System.out.println("可以上北大...");
		}else if(sumScore>580){
			System.out.println("南大...");
		}else if(sumScore >530){
			System.out.println("南师大...");
		}else{
			System.out.println("来网愽培训...");
		}	
		
		//if语句的嵌套
		if(sumScore>610){
			System.out.println("ddddd");
			if(sumScore>630){
				System.out.println("清华。。。。");
			}else{
				System.out.println("成绩在(610--630]");
			}
			System.out.println("xxxx");
		}else{
			System.out.println("aaaa");
			if(sumScore>520){
				
			}
		}
	}
	
	/*有三个变量，a,b,c,输出三个变量的最大值和最小值
	 * 
	 * */
}
