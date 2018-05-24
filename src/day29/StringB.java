package day29;
/*
 * 1.向字符串最后中添加（26个英文字符中的随机一个）字符，并删除字符串中第一个字符，
分别各用一个线程来完成
用生产者与消费思想实现，	
	添加线程可任意添加，不受限制
	删除线程中，当没有字符可删除时，要wait
 * 
 * */
public class StringB {
	StringBuffer sb = new StringBuffer();
	public synchronized void add()
	{
		Thread cur = Thread.currentThread();
		String name = cur.getName();
		/*random范围在[0,1),i的取值在[0,25]*/
		int i = (int)(Math.random()*26);
		//获取要添加的字符
		char c = (char)('a'+i);
		
		sb.append(c);
		System.out.println("生产了一个字符："+c+",线程"+name);
		this.notify();
	}
	
	public synchronized void delete()
	{
		Thread cur = Thread.currentThread();
		String name = cur.getName();
		if(sb.length()==0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				
			}
		}else{
			char c = sb.charAt(0);
			//删除第一个字符
			sb.deleteCharAt(0);
			System.out.println("删除一个字符"+c+",线程:"+name);
		}
	}
}
