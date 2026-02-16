class Node {
    int data;
    Node left, mid, right;

    public Node(int item) {
        data = item;
        left = mid = right = null;
    }
}

public class TernaryOakDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int midDepth = maxDepth(node.mid); // Consider the middle child
            int rightDepth = maxDepth(node.right);

            // Return the maximum depth among all children + 1 (for the current node)
            return Math.max(leftDepth, Math.max(midDepth, rightDepth)) + 1;
        }
    }

    public static void main(String[] args) {
        TernaryOakDepth tree = new TernaryOakDepth();
        Node root = new Node(1);
        root.left = new Node(2);
        root.mid = new Node(3); // Added a middle child
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.mid = new Node(6); // Added a middle child
        root.left.right = new Node(7);


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Another test case (a skewed tree):
         root = new Node(1);
        root.mid = new Node(2);
        root.mid.mid = new Node(3);
        root.mid.mid.mid = new Node(4);

         System.out.println("Height of tree is : " + tree.maxDepth(root));


    }
}

