package day14.异常;

public class Demo2 {
	public static void main(String[] args) {
		int[]a = {6,7,16,25,43,48,55,76};
		int[]b = {3,0,4,5,0,8};
		for(int i = 0;i<a.length;i++){
			try{
				System.out.println(a[i]+"/"+b[i]+" is "+a[i]/b[i]);
			}catch(ArithmeticException e){
				System.out.println("出现算术异常...");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("出现下标越界异常...");
			}catch(Exception e){
				
			}
		}
	}
}
