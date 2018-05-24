package day14.异常;

public class Demo1 {
	public static void main(String[] args) {
		String[]friends = {"张飞","马超","秦琼"};
		/*在try代码块中如果招聘异常对象，则不管该代码块中还剩下多少语句没执行，都
		 * 会跳出该代码块，到对应的分支中执行
		 * 
		 * */
		
		
		try{
			
			for(int i = 0;i<5;i++){
				System.out.println(friends[i]);
			}
		}catch(ArithmeticException e){
			System.out.println("出现算术异常");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("出现下标越界异常");
		}catch(RuntimeException e){
			
		}catch(Exception e){
			
		}
		
		System.out.println("哈哈");
	}
}
