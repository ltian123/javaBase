package day05;

public class Demo1 {
	public static void main(String[] args) {
		int m;
		int[]ps = {1,2,3,4,5};
		int[]ps1 = new int[10];
		int[]ps2 = new int[]{1,2,3,4};
		
		show(ps2);
	}
	public static void show(int []a){
//		System.out.println(a.length);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
