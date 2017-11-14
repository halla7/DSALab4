public class Driver {

    public static void main(String[] args) {
        Heap h = new Heap();
        h.makeHeap(20);

        System.out.println("Insert 4:");
        h.insert(4);
        h.printHeap();

        System.out.println("Insert: 12:");
        h.insert(12);
        h.printHeap();

        System.out.println("Insert 15:");
        h.insert(15);
        h.printHeap();

        System.out.println("Insert 40:");
        h.insert(40);
        h.printHeap();

        System.out.println("Insert 18:");
        h.insert(18);
        h.printHeap();

        System.out.println("Delete Min:");
        h.deleteMin();
        h.printHeap();

        System.out.println("Insert 35:");
        h.insert(35);
        h.printHeap();

        System.out.println("Decrease 40 to 3:");
        h.decreaseKey(h.getRoot().getLeftChild().getRightChild(), 3);
        h.printHeap();

        System.out.println("Delete 12:");
        h.delete(h.getRoot().getLeftChild());

        // Second heap
        Heap  h2 = new Heap();

        System.out.println("New heap: Starting with 25:");
        h2.makeHeap(25);
        h2.printHeap();

        System.out.println("Insert 5:");
        h2.insert(5);
        h2.printHeap();

        System.out.println("Insert 16");
        h2.insert(16);
        h2.printHeap();

        System.out.println("Insert 80:");
        h2.insert(80);
        h2.printHeap();

        System.out.println("Union 1st and 2nd heap:");
        Heap h3 = h.union(h2);
        h3.printHeap();
    }

}
