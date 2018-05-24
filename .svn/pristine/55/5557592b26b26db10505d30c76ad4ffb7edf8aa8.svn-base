package day33;
import java.io.IOException;
import java.net.*;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) throws Exception{
		InetAddress ia1 = InetAddress.getLocalHost();
		InetAddress ia2 = InetAddress.getByName("192.168.17.8");
		InetAddress ia3 = InetAddress.getByName("www.baidu.com");
		InetAddress ia4 = InetAddress.getByAddress(new byte[]{127,0,0,1});
		show(ia1);
	}
	public static void show(InetAddress ia) throws IOException{
		//得到主机名
		System.out.println(ia.getCanonicalHostName());
		System.out.println("该地址是否可到达？"+ia.isReachable(2000));
		//得到主机别名
		System.out.println(ia.getHostName());
		System.out.println("ip:"+ia.getHostAddress());
		byte[]arr1 = ia.getAddress();
		int[]arr2 = new int[arr1.length];
		for(int i = 0;i<arr1.length;i++){
			if(arr1[i]<0){
				arr2[i] = 256+arr1[i];
			}else{
				arr2[i] = arr1[i];
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
