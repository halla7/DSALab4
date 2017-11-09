/**
 * Created by spencers1 on 11/1/2017.
 */
public class Node {

    public Comparable data;
    private int height;
    private Node parent;
    private Node left;
    private Node right;
    private int balanceFactor;

    public Node(Comparable n) {
        this.data = (Comparable) n;
        balanceFactor = 0;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
    public int getHeight() {
        return this.height;
    }

    public Comparable getData() {
        return this.data;
    }


}
