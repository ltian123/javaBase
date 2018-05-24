package day14.异常.自定义;

public class Test {
	public static void main(String[] args) {
		checkPass("abc");
//		try {
//			
//		} catch (NullPointerException e) {
//
//		}
		System.out.println("xxxxx");
	}

	// 检测给定的字符串是否可以作为密码
	/*如果一个函数在运行过程中可能会抛出非运行时异常，则在定义函数时必须用throws声明一下
	 * 
	 * */
	public static boolean checkPass(String pass) {
		//如果pass为null则会自动产生异常
		// int leng = pass.length();
		try{
			if(pass==null){
				//手动产生异常
				throw new NullPointerException();
			}
			
		}catch(Exception e){
			
		}
		
		if(pass.length()<6){
			try {
				throw new PasswordException("密码长度小于6不合理!");
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
		
	}
}
