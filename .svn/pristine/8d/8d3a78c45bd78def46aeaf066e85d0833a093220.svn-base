package day13;
/*
把字符数组ch中的大写字符转为小写，小写转为大写，如果发现数组型字符，则把数字转
为对应的负数输出‘5’
*/
import java.util.*;
public class Home {
	public static void main(String[] args) {
		char []ch = {'1','r','T','*','^','8','哈'};
		int tmp = 0;
		for(int i = 0;i<ch.length;i++){
			if(ch[i]>='a'&&ch[i]<='z'){
				ch[i] = (char)(ch[i]-32);
			}else if(ch[i]>='A'&&ch[i]<='Z'){
				ch[i] = (char)(ch[i]+32);
			}else if(ch[i]>='0'&&ch[i]<='9'){
				tmp = '0'-ch[i];
				System.out.println(tmp);
			}
		}
		
		System.out.println(Arrays.toString(ch));
	}
}
