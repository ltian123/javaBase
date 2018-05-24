package day07;

/*报数*/
import java.util.*;

public class 作业 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入参与游戏的人数：");
		int length = in.nextInt();
		int[] arr = new int[length];

		// 喊号计数
		int say = 0;
		// 表示游戏中没喊三的人数
		int number = length;
		showArr(arr);
		for (int i = 0; i < arr.length;) {
			if (arr[i] != -1) {
				say++;
				if (say == 3) {
					say = 0;
					arr[i] = -1;
					number--;
					showArr(arr);
				}
			}
			i++;
			if (i == arr.length) {
				i = 0;
			}
			if (number == 1) {
				// 剩下最后一个人，跳出

				break;
			}

		}

	}

	static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
