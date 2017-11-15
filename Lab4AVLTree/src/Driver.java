public class Driver {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
//        tree.makeTree(12);
        tree.insert(tree.getRoot(), 33);

        tree.insert(tree.getRoot(), 23);

        tree.insert(tree.getRoot(), 16);

        tree.insert(tree.getRoot(), 22);

        tree.insert(tree.getRoot(), 25);

        tree.insert(tree.getRoot(), 28);
        tree.insert(tree.getRoot(), 80);
        tree.insert(tree.getRoot(), 51);
        tree.insert(tree.getRoot(), 70);
        tree.insert(tree.getRoot(), 85);
        tree.insert(tree.getRoot(), 92);



    }
}
