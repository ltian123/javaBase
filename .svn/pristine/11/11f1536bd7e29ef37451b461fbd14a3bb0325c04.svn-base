package day16.home;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Question[]paper = new Question[2];
		
		paper[0] = new Question("1+1=？",new String[]{"A. 100","B. 2","C. 12"},new char[]{'B'});
		paper[1] = new Question("西游记中都有哪几个女妖？",new String[]{"A. 白骨精","B. 玉兔","C. 铁公主","D.常娥"},new char[]{'A','B'});
		
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<paper.length;i++){
			System.out.println("第"+(i+1)+"题："+paper[i]);
			System.out.println("请答题：");
			String str = in.next();
			char[]answers = str.toCharArray();
			
			if(paper[i].check(answers)){
				System.out.println("回答正确");
			}else{
				System.out.println("错误，答案为："+new String(paper[i].answers));
			}
		}
	}
}
