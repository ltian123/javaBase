package day31.预编译sql;
/*数据模型*/
public class Student {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	String name;
	int score;
	
	public String toString(){
		return "id="+id+",name="+name+",score="+score;
	}
}
