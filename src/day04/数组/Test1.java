package day04.数组;

public class Test1 {
	public static void main(String[] args) {
		long l = 3;
		//第一种定义方式
		int[]arr = {1,2,3,4,5};
		//第二种，的数组默认值为0
		int[]arr1 = new int[50];
		int arr4[] = new int[50];
		boolean[]arr2 = new boolean[5];
		char[]arr3 = new char[5];
		//第三种
		int []arr5 = new int[]{1,2,3};
		//arr.length表示数组有几个元素
//		System.out.println(arr.length);
//		for(int i = 0;i<arr3.length;i++){
//			System.out.println((int)arr3[i]);
//		}
		show(new int[]{1,2,3,4,5,6,7,8});
		
	}
	
	static void show(int []arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
}
