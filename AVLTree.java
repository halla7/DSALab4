
public class AVLTree {
	private int height;
	private Node root;
	private String name;
	
	public AVLTree(String name){
		this.name = name;
		Node n = new Node();
		root=n;
	}
	
	public boolean search(Object o){
		boolean flag = false;
		Node current=root;
		for (int i=0; i<height; i++){
			if (current.data==o)
				return true;
			else if (o<current.data){
				current=current.leftchild;
			}else 
				current=current.rightchild;
		}
		
		return flag;
		
	}
	
	public void insert (){
		
	}
	
	public void delete(Object o){
		Node current=root;
		for (int i=0; i<height; i++){
			if (current.data==o){
				//don't copy this node to new AVL tree
			}else if (o<current.data){
				current=current.leftchild;
			}else 
				current=current.rightchild;
		}
		
	}
	
	public void inorder(){
		
	}
	
	public void count(){
		
	}

}
