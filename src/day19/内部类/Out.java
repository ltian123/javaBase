package day19.内部类;

public class Out {
	long outId;
	static String outName = "哈哈";
	//静态内部类
	public static class In
	{
		long inId;
		String inName;
		public void hello()
		{
			//System.out.println("outId"+outId);错误
			System.out.println("outname="+outName);
		}
	}
}
