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
        root.left.middle = new Node(6);
        root.left.right = new Node(7);



        System.out.println("Maximum depth of ternary tree is: " + tree.maxDepth(root));


        // Additional test cases  (you can uncomment these for more thorough testing)
        /*
        Node root2 = null;  // Empty tree
        System.out.println("Maximum depth of ternary tree is: " + tree.maxDepth(root2)); // Should print 0


        Node root3 = new Node(10); // Single node tree
        System.out.println("Maximum depth of ternary tree is: " + tree.maxDepth(root3)); // Should print 1


        root.left.left.left = new Node(8); // Deeper on the left side
        System.out.println("Maximum depth of ternary tree is: " + tree.maxDepth(root)); // Should print 4 now
        */


    }
}
