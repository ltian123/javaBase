package day21.蛇;
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		SnakePanel panel = new SnakePanel();
		Snake snake = panel.sk;
		System.out.println("请输入方向：");
		
		Scanner in = new Scanner(System.in);
		while(true){
			panel.show();
			String str = in.nextLine();
			if(str.equals("r")){
				snake.step(Snake.RIGHT);
			}else if(str.equals("u")){
				snake.step(Snake.UP);
			}else if(str.equals("d")){
				snake.step(Snake.DOWN);
			}else if(str.equals("l")){
				snake.step(Snake.LEFT);
			}else if(str.equals("q")){
				System.out.println("拜拜");
				break;
			}else{
				snake.step();
			}
		}
	}
}
