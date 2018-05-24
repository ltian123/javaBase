package day21.蛇;

import java.util.*;

public class Snake {
	int cols;
	int rows;
	// 用来存放蛇的身体节点
	LinkedList<Node> nodes = new LinkedList<Node>();
	// 用来存放食物节点
	LinkedList<Node> foods = new LinkedList<Node>();
	
	int dir;
	public static final int RIGHT = 1;
	public static final int LEFT = -1;
	public static final int UP = -10;
	public static final int DOWN = 10;
	
	public Snake()
	{
		//用于初始化蛇和食物
		nodes.add(new Node(3,9));
		nodes.add(new Node(4,9));
		nodes.add(new Node(5,9));
		nodes.add(new Node(5,10));
		nodes.add(new Node(5,11));
		nodes.add(new Node(6,11));
		nodes.add(new Node(7,11));
		
		foods.add(new Node(3,20));
		foods.add(new Node(4,18));
		foods.add(new Node(5,25));
		foods.add(new Node(5,16));
		foods.add(new Node(2,21));
		foods.add(new Node(8,15));
		foods.add(new Node(8,30));
		
		dir = RIGHT;
	}
	/*用于判断i,j位置是否在集合link中包含元素*/
	public boolean containsNode(int i,int j,LinkedList<Node>link){
		if(link == null){
			return false;
		}
		
		return link.contains(new Node(i,j));
	}
	
	/*让蛇走路*/
	public void step()
	{
		Node head = nodes.get(0);
		/*获取下个节点*/
		int i = head.i+dir/10;
		int j = head.j+dir%10;
		
		if(this.containsNode(i, j, nodes)){
			System.out.println("咬住身体了，Game Over!");
			System.exit(0);
		}
		if(i==0||i==rows-1||j==0||j==cols-1){
			System.out.println("撞墙边了,Game Over!");
			System.exit(0);
		}
		/*不管有没有食物，都应该在蛇头添加一个新节点*/
		nodes.add(0,new Node(i,j));
		/*如果包含食物，则吃食物，蛇增一节，食物少一个*/
		if(this.containsNode(i, j, foods)){
			foods.remove(new Node(i,j));
			if(foods.size()==0){
				System.out.println("恭喜通关，Game Over!");
				System.exit(0);
			}
		}else{
			nodes.removeLast();
		}
	}
	/*参数为用户指定的方向*/
	public void step(int dir){
		if(this.dir+dir==0){
			System.out.println("方向反了");
			return;
		}
		
		this.dir = dir;
		step();
	}
}
