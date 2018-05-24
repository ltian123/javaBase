package day05;
/*用if和for语句实现一个猜字游戏，要求用随机函数产生一个随机数字，范围在0--1000之间
 * 然后要增长用户猜 出答案，如果猜的太小，则提示太小，太大也提示太大，用户可以有三次机会猜字
 * 如果猜字范围误差在50以内则表示成功
 * */
import java.util.*;
public class HomeWork {
	public static void main(String[] args) {
		//[0,1);
		int random = (int)(Math.random()*1000);
		Scanner in = new Scanner(System.in);
		System.out.println("猜数字游戏开始，请给出[0--1000)之间的数字：");
		
		for(int i = 0;i<3;i++){
			int answer = in.nextInt();
			int result = random-answer;
			if(result>=-50&&result<=50){
				System.out.println("答题正确，标准答案为："+random);
				break;
			}else{
				if(i==2){
					System.out.println("很遗憾，你没有机会再答题！");
					break;
				}
				if(result>0){
					System.out.println("太小了");
				}else{
					System.out.println("太大了");
				}
			}
		}
	}
}
