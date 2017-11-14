
public class Driver {
	
	public static void main(String[] args){
		HeapTree myTree = new HeapTree();
		HeapNode myRoot = new HeapNode();
		myRoot=myTree.makeHeap(20);
		System.out.println(myTree.isEmpty());
		System.out.println(myRoot.getData());
	}

}
