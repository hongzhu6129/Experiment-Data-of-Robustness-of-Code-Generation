class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeMaxDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Recursively calculate the depth of the left and right subtrees
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the maximum depth plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        // Calculate and print the maximum depth
        int depth = tree.maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + depth);


        // Example with a different tree
         root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);  // Deeper left subtree

         depth = tree.maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + depth);


          // Example with an empty tree
        root = null;
         depth = tree.maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + depth);
    }
}
