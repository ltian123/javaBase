package day14.异常;

/*finally代码块：
 * 特点：如果有异常，被捕获到，会执行该代码块
 * 		没有异常，也会执行
 * 		有异常，但没被捕获也会执行
 * 要注意，与final区别：
 * */
public class Demo3 {
	int count = 1;

	public Demo3() {
		int x = 0;
		while (true) {
			try {
				x = 6 / count--;
//				break;
//				return;
				System.out.println("x="+x);
//				System.exit(0);

			} catch (ArithmeticException e) {
				System.out.println(x);
				return;

			} finally {
				System.out.println("进入finally");
				if (count == -1) {
					break;
				}
			}

		}
	}

	public static void main(String[] args) {
		new Demo3();
	}
}
