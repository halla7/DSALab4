/**
 * Created by spencers1 on 11/1/2017.
 */
public class AVLTree {

    private Node root;
    private int height;


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Node n = new Node(50);
        tree.setRoot(n);
        System.out.println(tree.search(30));
    }

    public void setRoot(Node n) {
        root = n;
    }
    public boolean search(Comparable n){
        Node current = root;
        boolean found = false;
        while (!found) {
            if (root.data.equals(null)) {
                return false;   // tree is empty
            } else if (current.getData().compareTo(n) < 0 && current.getLeft() != null) {
                found = false;
                current = current.getLeft();  // if value is less than parent node move to next left node
            } else if (current.getData().compareTo(n) < 0 && current.getLeft() == null ){
                return false;   // the node is not found
            }   if (current.getData().compareTo(n) == 0) {
                return true;    // when the current node is equal to n it is found

            } else if (current.getData().compareTo(n) > 0 && current.getRight() != null){
                found = false;
                current = current.getRight();   // if searched value is greater than parent node, move to next right node
            } else if (current.getData().compareTo(n) > 0 && current.getRight() == null) {
                return false;   // if there is no next right node stop searching
            }

        }
        return found;
    }

    public void insert(Node n) {
        Node current = root;
        Node parent = current;
        if (root == null) {
            this.setRoot(n);    // if the tree is empty, set root to parameter value
        } else {
            while (current != null && current.getData().compareTo(n.getData()) != 0) {
                // if the result of comparing current and n == 0 then there is a duplicate
                if(current.getData().compareTo(n.getData()) < 0) {
                    parent = current;
                    current = current.getLeft();
                } else {
                    parent = current;
                    current = current.getRight();
                }
            }
            if (current != null && current.getData().compareTo(n.getData()) == 0){  // when node already exists
                System.out.println("node already exists");
            }
        }

    }

    public void delete() {

    }

    public void inorder() {

    }

    public void count() {

    }


}
