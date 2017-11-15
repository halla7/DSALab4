
public class HeapTree implements MyHeap{
	private int nodes=0;
	private HeapNode root, last;
	
	@Override
	public HeapNode makeHeap(Comparable value) {
		// TODO Auto-generated method stub
		HeapTree myHeap = new HeapTree();
		this.insert(value);
		last=root;
		return root;
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
		int x,y,parentIndex;
		x=nodes;  //last inserted
		y=x%2;
		parentIndex=(x-1)/2;
		HeapNode n = new HeapNode(value);
		HeapNode last=this.getLast();
		if (x==0) {
			root=n;
			flag=true;
		} else if (y==1) {
			last=last.getParent();
			last.setRightChild(n);
			n.setParent(last.getParent());
			flag=true;
		} else {
			for (int i=1; i<=3; i++) {
				if (last.getParent()!=null) {
					last=last.getParent();
				}
			}
			if (last.getRightChild()!=null) {
				last=last.getRightChild();
			}
			while (last.getLeftChild()!=null) {
				last=last.getLeftChild();
			}
			last.setLeftChild(n);
			n.setParent(last);
			flag=true;
		}
		last=n;
		nodes++;
		return flag;
	}

	@Override
	public boolean delete(HeapNode del) {
		// TODO Auto-generated method stub
		return false;
	}
	public HeapNode getLast() {
		return last;
	}

}
