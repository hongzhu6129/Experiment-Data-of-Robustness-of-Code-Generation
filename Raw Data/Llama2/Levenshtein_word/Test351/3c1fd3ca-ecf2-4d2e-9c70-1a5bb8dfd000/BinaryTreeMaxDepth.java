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
            return 0; // Base case: Empty tree has depth 0
        }

        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        // Return the maximum of the left and right depths, plus 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Example usage: construct a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calculate and print the maximum depth
        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Output: 3


        // Example 2: An unbalanced tree
        Node root2 = new Node(1);
        root2.right = new Node(2);
        root2.right.right = new Node(3);
        root2.right.right.right = new Node(4);

        System.out.println("Max depth of the tree is: " + tree.maxDepth(root2)); // Output: 4


        // Example 3: Empty tree
        Node root3 = null;
        System.out.println("Max depth of the tree is: " + tree.maxDepth(root3)); // Output: 0

    }
}
