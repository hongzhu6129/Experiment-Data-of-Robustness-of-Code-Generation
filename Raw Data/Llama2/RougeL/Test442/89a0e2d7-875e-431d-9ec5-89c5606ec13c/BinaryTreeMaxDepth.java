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

            // Return the larger depth plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Create a sample binary tree
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        // Calculate and print the maximum depth
        int depth = tree.maxDepth(root);
        System.out.println("Maximum depth of the tree is: " + depth);


        // Test case with an empty tree
        Node emptyRoot = null;
        depth = tree.maxDepth(emptyRoot);
        System.out.println("Maximum depth of the empty tree is: " + depth);  // Output: 0

        // Test case with a tree having only one node
         Node singleNodeRoot = new Node(1);
        depth = tree.maxDepth(singleNodeRoot);
        System.out.println("Maximum depth of the single node tree is: " + depth); // Output : 1

    }
}


