import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by spencers1 on 11/1/2017.
 */
public class AVLTree {

    private Node root;
    private int height;
    private int count;
    private Node last;

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
//        tree.insert(new  Node(40));
//        tree.insert(new Node(30));
//        tree.insert(new Node(50));
    }

    public void setRoot(Node n) {
        root = n;
    }

//    public int treeHeight() {
//        if (root == null) {
//            return 0;
//        } else {
//            return root.getHeight();
//        }
//    }
    public boolean search(Comparable value){
        Node current = root;
        if (root == null) {
            return false;
        }
        boolean found = false;
        while (current != null && !found) {
            if (current.getData().compareTo(value) == 0) {
                return true;
            } else if (current.getData().compareTo(value) < 0) {
                found = false;
                current = current.getRight();
            } else {
                found = false;
                current = current.getLeft();
            }
        }

        return found;
    }

    public Node makeTree(Comparable value) {
        root = new Node(value);
        count++;
        return root;
    }

    public Node insert(Node node, Comparable value) {
        Node temp;
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (node == null) {
            return (new Node(value));
        }
        if (value.compareTo(node.getData()) < 0) {
            temp = insert(node.getLeft(), value);
            node.setLeft(temp);
        } else if (value.compareTo(node.getData()) > 0) {
            temp = insert(node.getRight(), value);
            node.setRight(temp);
        } else {
            return node;
        }
        int updatedHeight = Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
        node.setHeight(updatedHeight);
        int difference = getBalanceFactor(node);

        if (difference > 1 && node.getData().compareTo(node.getLeft().getData()) < 0) {
            return rightRotate(node);
        } else if (difference < -1 && node.getData().compareTo(node.getRight().getData()) > 0) {
            leftRotate(node);

        } else if (difference > 1 && node.getData().compareTo(node.getLeft().getData()) > 0) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        } else if (difference < -1 && node.getData().compareTo(node.getRight()) < 0) {
            node.setRight(rightRotate(node.getRight()));
        }

        return node;
    }

    public Node leftRotate(Node xNode) {
        Node yNode = xNode.getRight();
        Node t2 = yNode.getLeft();

        yNode.setLeft(xNode);
        xNode.setRight(t2);

        xNode.setHeight(Math.max(getHeight(xNode.getLeft()), getHeight(xNode.getRight())) + 1);
        yNode.setHeight(Math.max(getHeight(yNode.getLeft()), getHeight(yNode.getRight())) + 1);

        return yNode;
    }

    public Node rightRotate(Node yNode) {
        Node xNode = yNode.getLeft();
        Node t2 = xNode.getRight();

        xNode.setRight(yNode);
        yNode.setLeft(t2);

        xNode.setHeight(Math.max(getHeight(xNode.getLeft()), getHeight(xNode.getRight())) + 1);
        yNode.setHeight(Math.max(getHeight(yNode.getLeft()), getHeight(yNode.getRight())) + 1);

        return xNode;
    }

    public int getHeight(Node node) {
        if (node != null) {
            return node.getHeight();
        } else {
            return 0;
        }
    }

    public int getBalanceFactor(Node node) {
        if (node != null) {
            return getHeight(node.getLeft()) - getHeight(node.getRight());
        } else {
            return 0;
        }
    }

    public void printTree() {
        Queue<Node> currentLevel = new LinkedList<Node>();
        Queue<Node> nextLevel = new LinkedList<Node>();

        currentLevel.add(root);
        System.out.println("---------------------------");
        while (!currentLevel.isEmpty()) {
            Iterator<Node> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Node currentNode = iter.next();
                if (currentNode.getLeft() != null) {
                    nextLevel.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    nextLevel.add(currentNode.getRight());
                }
                System.out.print(currentNode.getData() + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();
        }
        System.out.println("---------------------------");
    }
    
    // in order
    public List convertToList() {
        Node currentNode = root;
        if (root == null) {
            return null;
        } else {
            while (currentNode != null) {
                if (currentNode.getLeft() != null) {
                    if (currentNode.getRight() != null) {
                        Node next = currentNode.getLeft();
                        while (next.getRight() != null) {
                            next = next.getRight();
                        }
                        next.setRight(currentNode.getRight());
                    }
                    currentNode.setRight(currentNode.getLeft());
                    currentNode.setLeft(null);
                }
                currentNode = currentNode.getRight();
            }


        }
        List<Node> list = new LinkedList<Node>();
        while (currentNode != null) {
            list.add(currentNode);
            currentNode = currentNode.getRight();
        }
        return list;
    }
    public Node getRoot() {
        return root;
    }
    public void delete() {

    }

    public void inorder() {

    }

    public void count() {

    }


}
