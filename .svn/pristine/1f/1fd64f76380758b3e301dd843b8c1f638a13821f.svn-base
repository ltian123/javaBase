package day26.线程.copy;
import java.io.*;
import java.util.Arrays;
public class Test1 {
	public static void main(String[] args)throws Exception {
		String s = "abcd北京ef春去秋来";
		s = cut(s,7);
		System.out.println(s);
	}
	//len = 7,-->abcd北
	static String cut(String src,int len)throws Exception{
		byte[]arr = src.getBytes("gbk");
		for(int i = 0;i<len;i++){
			if(arr[i]<0){
				i++;
				if(i==len){
					len--;
				}
			}
		}
		byte[]dest = Arrays.copyOf(arr, len);
		return new String(dest,"gbk");
	}
}
