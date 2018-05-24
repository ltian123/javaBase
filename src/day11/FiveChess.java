package day11;
import java.util.*;
/*
 *
1.定义一个二维字符数组 ，用于存放棋盘
2.定义init方法用于初始化该棋盘，也就是给二维数组全赋值为'+';
3.定义print方法用于打印棋盘
4.定义start方法，该方法是while(true),游戏不分胜负不退出，每落一子
	要判断是否分出输赢，分出输赢要调用四个自定义方法
5.定义4个方法，分别判断四个方向能否构成5个子
 * 
 * */
public class FiveChess {
	//用来存放棋盘
	static String[][]chesses = new String[10][10];
	//用来标识现在轮到哪一方落子
	static String[]who = {"黑方","白方"};
	//黑白双方所落的子
	static String[]whoChess = {"#","@"};
	//用于判断现在轮到哪一方落子
	static int whoIndex = 0;
	
	public static void main(String[] args) {
		
		start();
	}
	
	//初始化棋盘
	public static void init()
	{
		for(int i = 0;i<chesses.length;i++){
			for(int j = 0;j<chesses[i].length;j++){
				chesses[i][j] = "+";
			}
			
		}
	}
	
	//打印棋盘
	public static void print()
	{
		System.out.print("\t");
		for(int j = 0;j<chesses.length;j++){
			System.out.print(j+"\t");
		}
		System.out.println();
		
		for(int i = 0;i<chesses.length;i++){
			System.out.print(i+"\t");
			for(int j = 0;j<chesses[i].length;j++){
				System.out.print(chesses[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	//游戏核心功能
	public static void start()
	{
		Scanner sc = new Scanner(System.in);
		init();
		System.out.println("游戏开始!");
		while(true){
			print();
			System.out.println("请"+who[whoIndex%2]+"落子");
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			if(i<0||j<0||i>=chesses.length||j>=chesses[i].length){
				System.out.println("位置非法");
				continue;
			}
			
			if(!chesses[i][j].equals("+")){
				System.out.println("该位置已经有棋子");
				continue;
			}
			
			chesses[i][j] = whoChess[whoIndex%2];
			
		}
	}
	
	public static boolean charge(int i,int j){
		if(horizontalDirection(i,j)>=5){
			return true;
		}
		return false;
	}
	
	public static int horizontalDirection(int i,int j)
	{
		String ch = chesses[i][j];
		int count = 1;
		//向左
		int i1 = i;
		int j1 = j-1;
		
		while(j1>=0&&ch.equals(chesses[i1][j1])){
			count++;
			j1--;
		}
		
		//向右
		int i2 = i;
		int j2 = j+1;
		while(j2<chesses[i].length&&ch.equals(chesses[i2][j2])){
			count++;
			j2++;
		}
		return count;
	}
}
