package day14.枚举的使用;
/*enum父类是Enum*/
enum Light
{
	RED(1,"红色"),GREEN(2,"绿色"),YELLOW(3,"黄色");
	public int n;
	public String name;
	
	Light()
	{
		
	}
	//默认是private权限
	Light(int n,String name){
		this.n = n;
		this.name = name;
	}
	
	public String toString()
	{
		return "n="+n+",name="+name;
	}
}
public class Test2 {
	public static void main(String[] args) {
		//把该枚举可以被赋的值全放到数组中
		Light[]arr = Light.values();
		for(Light a:arr){
			System.out.println("当前灯name:"+a.name+",n="+a.n+",值为："+a.name());
		}
		
	}
}

