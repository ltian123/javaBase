package day06;
import java.util.Arrays;
public class 排序 {
	/*选择排序*/
	public static void sort1(String[] args) {
		int []arr = {5,6,1,2,45,23};
		System.out.println("排序前：");
		System.out.println(Arrays.toString(arr));
		//选择排序的特点：第一轮排序结束后，最小的在第一个位置
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("排序后：");
		System.out.println(Arrays.toString(arr));
	}
	/*冒泡排序*/
	public static void main(String[] args) {
		int []arr = {5,6,1,2,45,23};
		System.out.println("排序前：");
		System.out.println(Arrays.toString(arr));
		/*冒泡排序的特点：第一轮结束后，最大元素在最后位置，每一轮结束后，都会从后面
		 * 减少一个参与排序的元素*/
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
}
