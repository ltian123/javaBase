package day05;
/*定义五个元素的数组，找最大值，最小值，打印输出,并把最大值放第一个位置，最小值
 * 放最后*/
public class Demo3 {
	public static void main(String[] args) {
		int arr[] = {1,1,5,23,2};
		int max = 0,min = 0,tmp = 0;
		for(int i = 1;i<arr.length;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}//max = 3,
		
		/*元素交换后，不能保证min位置不发生变化，比如arr[0]原来存储的
		 * 就是最小值*/
		tmp = arr[0];
		arr[0] = arr[max];
		arr[max] = tmp;
		//{23,3,5,1,2}
		for(int i = 1;i<arr.length;i++){
			if(arr[min]>arr[i]){
				min = i;
			}
		}//min = 4;
		
		tmp = arr[4];
		arr[4] = arr[min];
		arr[min] = tmp;
		
		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
	}
}
