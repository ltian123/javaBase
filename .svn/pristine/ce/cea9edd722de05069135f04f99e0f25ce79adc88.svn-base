package day06;
import java.util.*;
public class 函数的使用 {
	public static void main(String[] args) {
		int[]src = {34,56,12,45,78,35};
//		show2(src,1,3);
		reverseArray(src);
		System.out.println(Arrays.toString(src));
//		show1(src);
	}
	public static void show1(int[]arr){
		for(int i = arr.length-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
	/*实现数组中的两个元素位置互换*/
	public static void show2(int[]arr,int i,int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	/*实现数组中元素反转*/
	public static void reverseArray(int[]arr){
		for(int i = 0;i<arr.length/2;i++){
			int j = arr.length-1-i;
			show2(arr,i,j);
		}
	}
	
}
