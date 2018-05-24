package day26.作业;
import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws Exception{
		Map <String,Integer>map = new HashMap<String,Integer>();
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("d:/work/1.txt"),"gbk");
		BufferedReader br = new BufferedReader(isr);
		//总行数
		int num = 0;
		String str;
		while((str = br.readLine())!=null){
			num++;
			Integer count = map.get(str);
			if(count==null){
				map.put(str, 1);
			}else{
				//能进入此处，说明str在前文中至少出现一次
				map.put(str, count+1);
			}
		}
		System.out.println(map);
		System.out.println("总行数："+num);
		
		//下面处理查找出现次数最多的字符
		Collection <Integer>values = map.values();
		int n = Collections.max(values);
		System.out.println("最大次数："+n);
		
		Set<String>keys = map.keySet();
		for(String s:keys){
			if(map.get(s)==n){
				System.out.println(s+":"+n);
			}
		}
	}
}
