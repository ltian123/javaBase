package day15.酒店管理;
import java.util.*;
public class Manager {
	Hotel h;
	public Manager()
	{
		h = new Hotel(8,10);
		work();
	}
	void work()
	{
		System.out.println("=======欢迎进入风情酒店管理系统========");
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("====请选择你要执行的操作：查看所有空房间，请输入1;查看"
					+ "某个房间请输入2;入住房间请输入3;退房请输入4：");
			int mode = in.nextInt();
			out:switch(mode){
			case 1:
				h.selectAllEmptyRooms();
				break;
			case 2:
				System.out.println("请输入你要查询的房间号：");
				Room tmp = h.selectRoomById(in.nextInt());
				System.out.println(tmp);
				break;
			case 3:
				System.out.println("请分别输入要入住的房间号，客户姓名，"
						+ "身份证，入住开始时间，天数，并用逗号隔开:");
				String s = in.next();
				String[]arr = s.split(",");
				Room r = h.selectRoomById(Integer.parseInt(arr[0]));
				Customer c = new Customer(arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]));
				int errors = 0;
				while(r==null||!r.isEmpty()){
					if(errors>2){
						System.out.println("对不起，你输入错误次数太多，请重新操作本系统....");
						break out;
					}
					System.out.println("请重新输入房间号：");
					r = h.selectRoomById(in.nextInt());
					errors ++;
				}
				r.in(c);
				System.out.println("入住成功，客户信息如下：\n"+c);
				break;
			case 4:
				System.out.println("请输入房间号：");
				r = h.selectRoomById(in.nextInt());
				r.out();
				System.out.println("退房成功！");
				break;
				default:
					System.out.println("本系统没有此功能!");
					break;
			}
		}
	}
}
