/**
 * Created by spencers1 on 11/13/2017.
 */
public class Heap implements MyHeap {

    HeapNode root;
    int count;
    @Override
    public HeapNode makeHeap(Comparable value) {
        root = new HeapNode(value);
        return root;
    }

    @Override
    public boolean isEmpty() {
        if (root == null) {
            count++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean insert(Comparable value) {
        if (root == null) {
            this.makeHeap(value);
        } else {
            count ++;
        }
        return false;
    }

    @Override
    public boolean deleteMin() {
        return false;
    }

    @Override
    public boolean decreaseKey(Node key, Comparable updateValue) {
        return false;
    }

    @Override
    public boolean delete(HeapNode del) {
        return false;
    }

    @Override
    public boolean union(MyHeap heap) {
        return false;
    }

    @Override
    public Comparable findMin() {
        return null;
    }
}
