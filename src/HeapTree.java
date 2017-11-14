
public class HeapTree implements MyHeap{
	private int nodes=0;
	
	@Override
	public HeapNode makeHeap(Comparable value) {
		// TODO Auto-generated method stub
		HeapTree myHeap = new HeapTree();C
		nodes++;
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (nodes>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteMin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean decreaseKey(Node key, Comparable updateValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean union(MyHeap heap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable findMin() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean insert(Comparable value) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int x,y,parent;
		x=nodes;  //last inserted
		y=x%2;
		parent=(x-1)/2;
		HeapNode n = new HeapNode(value);
		if (y==1)
			//put n on right side of parent
			parent.setRightChild(n);
		else {
			while (parent.leftchild==null) {
			//find parent that has no right node
				parent=.parent.parent
			}
			n.setparent(parent);
			parent.setLeftChild(n);
		}
			
		return flag;
	}

	@Override
	public boolean delete(HeapNode del) {
		// TODO Auto-generated method stub
		return false;
	}

}
