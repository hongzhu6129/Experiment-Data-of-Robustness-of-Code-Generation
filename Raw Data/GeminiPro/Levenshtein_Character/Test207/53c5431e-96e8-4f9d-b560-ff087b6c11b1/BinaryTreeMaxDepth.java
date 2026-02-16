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

            // Return the maximum of the two depths + 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Example tree creation:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Output: 3

         // Example for an empty tree:
        Node emptyRoot = null;
        System.out.println("Max depth of an empty tree is: " + tree.maxDepth(emptyRoot)); // Output 0

        // Example for a tree with only a root node:
        Node singleNodeRoot = new Node(10);
        System.out.println("Max depth of a single node tree is: " + tree.maxDepth(singleNodeRoot)); // Output: 1
    }
}
