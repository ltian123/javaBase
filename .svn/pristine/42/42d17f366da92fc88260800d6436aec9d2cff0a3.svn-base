package day21.蛇;

public class Node {
	public Node(int k, int l) {
		i = k;
		j = l;
	}
	int i;
	int j;
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		
		if(obj==this){
			return true;
		}
		
		if(obj instanceof Node){
			Node n = (Node)obj;
			return i==n.i&&j==n.j;
		}
		
		return false;
	}
}
