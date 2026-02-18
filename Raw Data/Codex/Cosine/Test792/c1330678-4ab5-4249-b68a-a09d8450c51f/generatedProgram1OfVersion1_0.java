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
            // Recursively find the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger of the two subtree depths plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Construct a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6); // Added a deeper node


        // Calculate and print the maximum depth
        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Output: 4


        //Test case 2: Empty tree
        Node emptyRoot = null;
        System.out.println("Max depth of empty tree: " + tree.maxDepth(emptyRoot)); // Output: 0

        //Test case 3: Tree with only root node
        Node singleNodeRoot = new Node(7);
        System.out.println("Max depth of single node tree: " + tree.maxDepth(singleNodeRoot)); // Output: 1
    }
}
