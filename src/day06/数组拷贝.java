package day06;
import java.util.*;
public class 数组拷贝 {
	public static void main(String[] args) {
		int[]arr = {4,6,3,9,10,12};
		int[]d = new int[4];
//		copyArr(arr,d);第一种，通过自定义方法 来实现
//		System.arraycopy(arr, 1, d, 1, 3);第二种，能过arraycopy实现
		
		int[]dest = Arrays.copyOf(arr, arr.length);
		
		
		
		
		System.out.println(Arrays.toString(dest));
		
	}
	public static void copyArr(int []src,int[]dest)
	{
		int length = Math.min(src.length, dest.length);
		for(int i = 0;i<length;i++){
			dest[i] = src[i];
		}
	}
}
