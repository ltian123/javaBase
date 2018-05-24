package day22.递归;

public class Test1 {
	public int m(int num)
	{
		if(num<=0){
			return 1;
		}else{
			return m(num-1)+m(num-2);
		}
	}
	/*1.m(2)+m(1);
	 *2.m(1)+1+m(1)
	 *3.m(0)+m(-1)+1+m(0)+m(-1); 
	 * */
	
	
	public static void main(String[] args) {
		double rs = calc2(2,-2);
		System.out.println(rs);
	}
	/*计算x的y次方的值是多少
	 * 比如3的4次方
	 * */
	public static int calc1(int x,int y){
		int rs = 1;
		for(int i = 1;i<=y;i++){
			rs = rs*x;
		}
		return rs;
	}
	
	public static double calc2(int x,int y){
		if(y==0){
			return 1;
		}else if(y>0){
			return x*calc2(x,y-1);
		}else{
//			return 1.0/(x*calc2(x,1+y));
			return (1.0/x)*calc2(x,y+1);
		}
	}
}
