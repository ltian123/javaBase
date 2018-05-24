package day15.异常练习;

public class Thief {
	public void stealFromHousehold(Household h)throws StealException,NullPointerException{
//		System.out.println(h.personNum);
		if(h==null){
			//如果手动抛出的是运行时异常，则可以不必声明
			throw new NullPointerException();
		}
		//在程序中一旦抛出异常，则会跳出该函数的执行
		if(h.personNum>1){
			throw new StealException(
					"这家人太多",
					new InfoException("是谁告诉我说这家里就没人来的？"));
		}else if(h.personNum==1){
			throw new StealException("一个人",new InfoException("听说这家如果有人"
					+ "的话，也是个美女，结果是母老虎，还被她..."));
		}
		
		System.out.println("成功拿到东西....");
	}
}
