package day15.酒店管理;
import java.util.*;
public class Hotel {
	//楼层数
	int levels;
	//每层的房间数
	int num;
	Room[][]rooms;
	
	public Hotel(int levels,int num){
		this.levels = levels;
		this.num = num;
		rooms = new Room[levels][num];
		
		//开始盖房子
		for(int i = 0;i<rooms.length;i++){
			for(int j = 0;j<rooms[i].length;j++){
				rooms[i][j] = new Room(i*100+j);
			}
		}
	}
	//按房间编号查询房间,10007
	Room selectRoomById(int NO)
	{
		int i = NO/100;
		int j = NO%100;
		if(NO<0||i>levels-1||j>num-1){
			System.out.println("还没盖到这一间");
			return null;
		}
//		System.out.println(rooms[i][j]);
		return rooms[i][j];
	}
	//查询所有可入住的空房间
	void selectAllEmptyRooms()
	{
		//107-->0107
		String[]tmp = new String[levels*num];
		int count = 0;// 统计空房间数目
		for(int i = 0;i<rooms.length;i++){
			for(int j = 0;j<rooms[i].length;j++){
				if(rooms[i][j].isEmpty()){
					String level = null;
					if(i<10){
						level = "0"+i;
					}else{
						level = ""+i;
					}
					
					String num = null;
					if(j<10){
						num = "0"+j;
					}else{
						num = ""+j;
					}
					tmp[count] = level+"-"+num;
					count++;
				}
			}
		}
		tmp = Arrays.copyOf(tmp, count);
		System.out.println("目前有如下空房间："+Arrays.toString(tmp));
	}
	
}
