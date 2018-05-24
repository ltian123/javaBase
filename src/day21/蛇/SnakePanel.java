package day21.蛇;
/*用于画游戏面板*/
public class SnakePanel {
	int cols = 32;
	int rows = 10;
	Snake sk;
	public SnakePanel()
	{
		sk = new Snake();
		sk.cols = cols;
		sk.rows = rows;
	}
	/*游戏面板画出来*/
	public void show()
	{
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				if(i==0||i == rows-1){
					System.out.print("-");
				}else if(j== 0||j==cols-1){
					System.out.print("|");
					
				}//下面用于判断在i,j位置是否存在蛇
				else if(sk.containsNode(i, j, sk.nodes)){
					System.out.print("#");
				}else if(sk.containsNode(i, j, sk.foods)){
					System.out.print("*");
				}
				
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
