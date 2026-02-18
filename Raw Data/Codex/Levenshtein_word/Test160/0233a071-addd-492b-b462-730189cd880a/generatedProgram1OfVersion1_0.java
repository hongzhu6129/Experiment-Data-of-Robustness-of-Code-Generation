class Node {
    int data;
    Node left, middle, right;

    public Node(int item) {
        data = item;
        left = middle = right = null;
    }
}

public class TernaryTreeMaxDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int middleDepth = maxDepth(node.middle);
            int rightDepth = maxDepth(node.right);

            return Math.max(leftDepth, Math.max(middleDepth, rightDepth)) + 1;
        }
    }

    public static void main(String[] args) {
        TernaryTreeMaxDepth tree = new TernaryTreeMaxDepth();
        Node root = new Node(1);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.middle = new Node(6);  // Added a middle child to demonstrate handling of middle nodes
        root.left.right = new Node(7);

        System.out.println("Maximum depth of ternary tree is: " + tree.maxDepth(root));


        // Test case 2:  Empty tree
        Node emptyRoot = null;
        System.out.println("Maximum depth of empty ternary tree is: " + tree.maxDepth(emptyRoot)); // Should print 0

        // Test case 3: Single node tree
         Node singleNodeRoot = new Node(10);
        System.out.println("Maximum depth of single node ternary tree is: " + tree.maxDepth(singleNodeRoot)); // Should print 1
    }
}




