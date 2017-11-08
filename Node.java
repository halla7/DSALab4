
public class Node {
	private Comparable data;
	public Node parent;
	public Node leftchild;
	public Node rightchild;
	public char balancefactor;
	
	public Node(){
		
	}
	
	public Node(T o){
		this.data = o;
	}

}
