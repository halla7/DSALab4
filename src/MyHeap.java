
public interface MyHeap {
	public HeapNode makeHeap(Comparable value);
	public boolean isEmpty();
	public boolean insert(Comparable value);
	public boolean deleteMin();
	public boolean decreaseKey(Node key, Comparable updateValue);
	public boolean delete(HeapNode del);
	public boolean union(MyHeap heap);
	public Comparable findMin();
	public HeapNode getLast();

}
