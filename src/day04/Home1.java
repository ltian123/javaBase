package day04;

import java.util.*;

public class Home1 {
	public static void main(String[] args) {
		int month = 0, day = 0, year = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年、月、日");
		/* 输入年月日 */
		year = in.nextInt();
		month = in.nextInt();
		day = in.nextInt();
		/* 判断上次输入的参数是否合法，不合法则重新输入，只允许有三次机会 */
		for (int i = 0; i < 2; i++) {
			if (month <= 0 || month > 12 || day <= 0 || day > 31) {
				System.out.println("参数非法，请重新给出日期：");
				year = in.nextInt();
				month = in.nextInt();
				day = in.nextInt();
			} else {
				break;
			}
		}

		switch (month) {
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				sum += 29;
				if(day>29){
					System.out.println("参数非法");
					break;
				}
			} else {
				if(day>28){
					System.out.println("参数非法");
					break;
				}
				sum += 28;
			}
		case 2:
			sum += 31;
		case 1:
			sum += day;
		default:
			break;
		}
		System.out.println(year+"年"+month+"月"+day+"day是这一年的第"+sum+"天");
	}
}
