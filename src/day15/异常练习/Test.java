package day15.异常练习;

public class Test {
	public static void main(String[] args) {
		Thief t = new Thief();
		Household h = new Household(3);
		try {
			t.stealFromHousehold(h);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (StealException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
