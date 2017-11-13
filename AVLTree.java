import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by spencers1 on 11/1/2017.
 */
public class AVLTree {

    private Node root;
    private int height;


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
//        tree.insert(new  Node(40));
//        tree.insert(new Node(30));
//        tree.insert(new Node(50));
    }

    public void setRoot(Node n) {
        root = n;
    }

    public int treeHeight() {
        if (root == null) {
            return 0;
        } else {
            return root.getHeight();
        }
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
    public Node rightRotate(Node root) {
        Node rootLeftChild = root.getLeft();
        root.setLeft(rootLeftChild.getRight());
        rootLeftChild.setRight(root);

        root.setHeight(getMax(root.getLeft().getHeight(), root.getRight().getHeight()) + 1);
        rootLeftChild.setHeight(getMax(rootLeftChild.getLeft().getHeight(), rootLeftChild.getRight().getHeight()) + 1);

        return rootLeftChild;
    }

    public Node leftRotate(Node root) {
        Node rootRightChild = root.getRight();
        root.setRight(rootRightChild.getLeft());
        rootRightChild.setLeft(root);

        root.setHeight(getMax(root.getLeft().getHeight(), root.getRight().getHeight()) + 1);
        rootRightChild.setHeight(getMax(rootRightChild.getLeft().getHeight(), rootRightChild.getRight().getHeight()) + 1);

        return rootRightChild;

    }
    public int getMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public Node recursiveInsert(Node n, Comparable value) {
        if (root == null) {
            this.setRoot(new Node(value));
            return root;
        } else if(value.compareTo(root.getData()) < 0) {
            root.left = recursiveInsert(root.getLeft(), value);
        }
            else if(value.compareTo(root.getRight()) > 0) {
            root.right = recursiveInsert(root.getRight(), value);
            } else {
            return root;
        }

        n.setHeight(getMax(n.getLeft().getHeight(), n.getRight().getHeight()) + 1);

        if (n.getBalance() > 1 && value.compareTo(n.getLeft().getData()) < 0) {
            return leftRotate(n);
        } else if (n.getBalance() < -1 && value.compareTo(n.getRight().getData()) > 0) {
            return rightRotate(n);
        } else if (n.getBalance() > 1 && value.compareTo(n.getLeft().getData()) > 0) {
            return rightRotate(n);
        } else if (n.getBalance() > 1 && value.compareTo(n.getRight().getData()) < 0) {
            return leftRotate(n);
        }
            return root;

    }

    public void insert(Comparable value) {
        root = recursiveInsert(root, value);
    }
//    public void insert(Node n) {
//        Node current = root;
//        Node parent = current;
//        if (root == null) {
//            this.setRoot(n);    // if the tree is empty, set root to parameter value
//
//
//        }
//
//        while (current != null && current.getData().compareTo(n.getData()) != 0) {
//            // if the result of comparing current and n == 0 then there is a duplicate
//            if(current.getData().compareTo(n.getData()) < 0) {
//                parent = current;
//                current = current.getLeft();
//            } else {
//                parent = current;
//                current = current.getRight();
//            }
//        }
//
//        if (current != null && current.getData().compareTo(n.getData()) == 0){  // when node already exists
//            System.out.println("node already exists");
//            return false;
//        }

//    }
    public void printTree() {
        boolean first = true;
        int count = 0;
        Queue<Node> currentLevel = new LinkedList<Node>();
        Queue<Node> nextLevel = new LinkedList<Node>();
        currentLevel.add(root);
        String output = "";
        while (currentLevel.size() > 0) {
            Node currentNode = currentLevel.remove();
            if (currentNode != null) {
                if (first) {
                    first = false;
                    System.out.println(count + ": ");
                    count++;
                }
            }

            if (currentLevel.size() > 0) {
                System.out.println(" ");
                nextLevel.add(currentNode.getLeft());
                nextLevel.add(currentNode.getRight());
            }
            if (currentLevel.size() == 0) {
                System.out.println();
                first = true;
                currentLevel = nextLevel;
                nextLevel = new LinkedList<Node>();
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
