package day04;
public class GetAverage {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		//外层循环控制班级
		for(int i = 1;i<=3;i++){
			System.out.println("请输入第"+i+"个班级的成绩：");
			int sum = 0;
			//内层循环控制班级中的学生数量
			for(int j = 1;j<=4;j++){
				System.out.println("请输入第"+j+"个学生的成绩：");
				int score = in.nextInt();
				sum+=score;
//				System.out.print("sss");
			}
			double avg = sum/4.0;
			System.out.println("=====第"+i+"个班的平均分为："+avg);
		}
	}
	/*#
	 *# #
	 *# # #
	 *# # # #
	 *# # # # #
	 *
	 *
	 *########
	 *#######
	 *######
	 *#####
	 *####
	 *###
	 *##
	 *#
	 * 
	 * 
	 * 
	 * 
	 * */
}
