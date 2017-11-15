/**
 * Created by spencers1 on 11/1/2017.
 */
public class Node {

    public Comparable data;
    private int height;
    private Node parent;
    protected Node left;
    protected Node right;
    private int balanceFactor;

    public Node(Comparable n) {
        this.data = (Comparable) n;
        balanceFactor = 0;
        left = null;
        right = null;
    }

    public void setHeight(int value) {
        height = value;
    }

    public int getHeight() {
        return this.height;
    }
    public Node getLeft() {
        return this.left;
    }

    public void setRight(Node n) {
        right = n;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public Node getRight() {
        return this.right;
    }


    public Comparable getData() {
        return this.data;
    }

    public int getBalance() {
        return (getLeft().getHeight() - getRight().getHeight());
    }


}