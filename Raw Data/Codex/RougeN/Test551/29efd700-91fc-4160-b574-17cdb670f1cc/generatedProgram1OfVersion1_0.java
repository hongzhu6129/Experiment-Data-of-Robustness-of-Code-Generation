class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaxDepthBinaryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            // Get the depth of the left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the larger depth plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1; 
        }
    }

    public static void main(String[] args) {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();

        // Example tree construction (you can modify this)
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));  // Output: 3

        // Another Example
        Node root2 = new Node(1);
        root2.right = new Node(2);
        root2.right.right = new Node(3);

        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root2));  // Output: 3

         // Example with an empty tree
        Node root3 = null;
        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root3));  // Output: 0
    }
}
