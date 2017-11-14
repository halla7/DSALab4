
public class Node {
	private Comparable data;
	public Node parent;
	public Node leftchild;
	public Node rightchild;
	public char balancefactor;
	
	public Node(){
		
	}
	
	public Node(Comparable o){
		this.data = o;
	}

}
