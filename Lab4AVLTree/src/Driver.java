public class Driver {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
//        tree.makeTree(12);
        tree.insert(tree.getRoot(), 33);
 //       tree.printTree();
        tree.insert(tree.getRoot(), 23);
 //       tree.printTree();
        tree.insert(tree.getRoot(), 22);
 //       tree.printTree();
        tree.delete(tree.getRoot().getLeft(), tree.getRoot().getLeft().getData());
        tree.insert(tree.getRoot(), 25);
        tree.inorder(tree.getRoot());
        System.out.println(tree.count(tree.getRoot(), 18, 35));
        tree.insert(tree.getRoot(), 28);
  //      tree.printTree();
        tree.insert(tree.getRoot(), 80);
  //      tree.printTree();
        tree.insert(tree.getRoot(), 51);
  //      tree.printTree();
        tree.insert(tree.getRoot(), 70);
  //      tree.printTree();
        tree.insert(tree.getRoot(), 85);
  //      tree.printTree();
        tree.insert(tree.getRoot(), 92);
  //      tree.printTree();



    }
}
