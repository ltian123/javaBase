package day06;
import java.util.*;
public class HomeWork {
	public static void main(String[] args) {
//		 {{1},{2,2},{3,4,5}};
		int[][]scores = new int[3][5];
		
		Scanner in = new Scanner(System.in);
		//给每个班的每个学生赋值
		for(int i = 0;i<scores.length;i++){
			//统计每个班总分
			double sum = 0;
			System.out.println("=====请输入第"+(i+1)+"个班级的成绩========");
			for(int j = 0;j<scores[i].length;j++){
				System.out.println("请输入第"+(j+1)+"个学生的成绩：");
				scores[i][j] = in.nextInt();
				sum = sum+scores[i][j];
				
			}
			System.out.println("第"+(i+1)+"个班级的平均分为："+sum/scores[i].length);
			
		}
		int max = scores[0][0];
		int min = scores[0][0];
		for(int i = 0;i<scores.length;i++){
			for(int j = 0;j<scores[i].length;j++){
				if(max<scores[i][j]){
					max = scores[i][j];
				}
				if(min>scores[i][j]){
					min = scores[i][j];
				}
			}
		}
		System.out.println("最高分："+max+",最低分："+min);
		
		
	}
}
