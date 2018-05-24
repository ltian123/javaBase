package day05;

public class 二维数组 {
	public static void main(String[] args) {
		int[]arr1 = new int[5];
		
		int[][]arr2 = new int[3][];
		System.out.println(arr2.length);
		arr2[0] = new int[10];
		arr2[1] = new int[4];
		arr2[2] = new int[]{1,2,3};
		System.out.println(arr2[1].length);
		System.out.println("=================");
		for(int i = 0;i<arr2.length;i++){
			for(int j = 0;j<arr2[i].length;j++){
				System.out.print("arr2["+i+"]["+j+"]="+arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*有三个班，每个班5名学生，提示用户分别输入每个班每名学生的成绩，并保存在
		 * 二维数组中，计算每个班级的平均分，全校最高分和最低分
		 * */
		
	}
}
