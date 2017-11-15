
public class Driver {
	
	public static void main(String[] args){
//  AVL test code
/*        AVLTree myTree = new AVLTree();
 *        for (int i=1; i<6; i++)
 *        	myTree.insert(i*5);
 *       
 *      System.out.println(myTree.search(myTree,15));
 *		//myTree.printTree();
 * 
 */
		HeapTree myTree = new HeapTree();
		for (int i=1; i<6; i++)
		   	myTree.insert(i*5);
		System.out.println(myTree.isEmpty());
		System.out.println(myTree.getLast().getData());

	}

}
