package DataStructures.BigO.Trees;

public class Trees {
    public static void main(String[] args){
        // tree = a non-linear data structure where nodes are organized in a hierarchy

        // would be used in a file explorer, databases, DNS, HTML DOM
        // subtree = a smaller tree held within a larger tree

        // binary search tree = a tree data structure, where each node is greater than its left child,
        //                      but less than the right
        //                      BENEFIT: easy to locate a node when they are in this order

        //                      TIME COMPLEXITY: best case O(log n)
        //                                       worst case O(n)
        //                      space complexity: O(n)

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();
        System.out.println();

        System.out.println(tree.search(10));

        tree.remove(1);
        tree.remove(5);
        tree.remove(9);
        tree.remove(0);
        tree.display();
    }
}
