package day35.反射;
//注意，导包是用的反射包中的类
import java.lang.reflect.*;
import java.util.*;
public class Test1 {
	//对属性的操作
	public static void test(String[] args)throws Exception {
		Stu s = new Stu("哈哈",23);
		Class cs = Stu.class;
		
		/*获取某个类的所有public属性*/
//		Field[]fields = cs.getFields();
		//获取某个类中所有声明的属性字段，但不含父类
		Field[]fields = cs.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f.getName());
		}
		/*获取某一项属性*/
		Field f = cs.getDeclaredField("name");
		//设置私有属性可访问
		f.setAccessible(true);
		f.set(s, "tom");
		System.out.println(f.get(s));
	}
	//对方法的操作
	public static void test2(String[] args) throws Exception {
		Stu s = new Stu("哈哈",23);
		Class cs = Stu.class;
		/*获取本类及父类中所有的公有方法*/
		//Method[]methods = cs.getMethods();
		/*获取本类中所有的方法,但不包含父类中任何方法 */
		Method[]methods = cs.getDeclaredMethods();
		for(Method m:methods){
			System.out.println(m.getName());
			Class[]arr = m.getParameterTypes();
			System.out.println(Arrays.toString(arr));
		}
		
		Method meth = cs.getDeclaredMethod("add", int.class,int.class);
		Object[]p = {1,2};
		Object obj = meth.invoke(s, p);
		System.out.println(obj);
		
	}
	public static void test3(String[] args)throws Exception {
		Class cs = Stu.class;
		//Stu st = (Stu)cs.newInstance();
		Constructor[]arr = cs.getDeclaredConstructors();
		for(Constructor con:arr){
			System.out.print(con.getName()+":");
			Class[]cls = con.getParameterTypes();
			System.out.println(Arrays.toString(cls));
		}
		
		Constructor con = cs.getDeclaredConstructor(String.class,int.class);
		Stu st = (Stu)con.newInstance("jack",23);
		System.out.println(st.add(34, 23));
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show(t);
		
	}
	public void show(Object o){
		Class cls = o.getClass();
		Method[]methods = cls.getDeclaredMethods();
		for(Method m:methods){
			if((m.getName().startsWith("set"))&&(Modifier.isPublic(m.getModifiers()))){
				System.out.println(m.getName()+","+m.getReturnType().getSimpleName());
			}
		}
	}
	
	public String setM1(){
		return "abc";
	}
}
/*定义一个方法，参数为Object类型，
 * 要求利用反射输出该参数对象中以set开头的public修饰的方法名称和返回值类型

 * */


