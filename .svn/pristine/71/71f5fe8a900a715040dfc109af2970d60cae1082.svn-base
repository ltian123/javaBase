package day09.作业;
/*
 * 编写一个方法，如String transfer(int num);
	该方法返回num的32位二进制形式
	提示1.
	比如：5，字符串为000000000101;可以考虑用2的n次方把对应位的0或1取出
	提示2.
	int型值最大值max为2的31次方-1;
	2的31次方或2的32等 ，大于等于31次方法 的数据，如果强转为int则均为max
	(int)Math.pow(2,n)
 * */
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(transfer(-5));
	}
	public static String transfer(int num)
	{
		String s = "";
		for(int i = 0;i<32;i++){
			if(i%4==0&&i>0){
				s = s+"-";
			}
			long n = num&(long)Math.pow(2, 32-i-1);
			if(n>0){
				s = s+"1";
			}else{
				s = s+"0";
			}
		}
		return s;
	}
}
