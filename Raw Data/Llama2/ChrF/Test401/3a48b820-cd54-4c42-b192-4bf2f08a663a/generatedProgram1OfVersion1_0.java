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
            return 0; // Base case: An empty tree has a depth of 0
        } else {
            // Recursively calculate the depth of the left and right subtrees
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the maximum of the left and right subtree depths, plus 1 for the current node
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

        // Calculate and print the maximum depth
        int depth = tree.maxDepth(root);
        System.out.println("Maximum depth of the binary tree is: " + depth);


        // Example 2: A single node tree
        Node singleNode = new Node(10);
        depth = tree.maxDepth(singleNode);
        System.out.println("Maximum depth of the single node tree is: " + depth);

        // Example 3: An empty tree
        depth = tree.maxDepth(null);
        System.out.println("Maximum depth of the empty tree is: " + depth);
    }
}

