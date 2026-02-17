class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeMaxDepth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            // Recursively calculate the depth of the left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the larger depth plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Construct a sample binary tree
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);


        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root)); // Output: 3

         // Test with an empty tree
        root = null;
        System.out.println("Maximum depth of the empty tree is: " + tree.maxDepth(root)); // Output: 0

        // Test with a tree with only one node
        root = new Node(1);
        System.out.println("Maximum depth of the single-node tree is: " + tree.maxDepth(root)); // Output: 1
    }
}

