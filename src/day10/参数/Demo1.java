package day10.参数;

public class Demo1 {
	public static void main(String[] args) {
		int m = 10;
		Demo1 d = new Demo1();
		d.sum1(m);
		int[]arr = {3,2,1};
		int sum = d.sum1(arr);
//		System.out.println(sum);
//		d.sum2(1,2,3);
		sum = d.sum1(arr);
		System.out.println(sum);
	}

	public int sum1(int a){
		System.out.println("一个参数");
		return 1;
	}
	
//	public int sum1(int[]a){
//		int sum = 0;
//		for(int i = 0;i<a.length;i++){
//			sum+=a[i];
//		}
//		return sum;
//	}
	/*可变参数要放在最后，在调用方法时，如果出现重载，则先找固定参数，再跟可变参数匹配*/
	public int sum1(int ...a)
	{
		int sum = 0;
		for(int i = 0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	
}
