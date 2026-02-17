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

            // Return the larger of the two depths plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));



        // Test case 2:  Empty tree.
        Node root2 = null;
        System.out.println("Height of tree is : " + tree.maxDepth(root2)); // Should output 0

        // Test case 3: Tree with only root node.
        Node root3 = new Node(7);
        System.out.println("Height of tree is : " + tree.maxDepth(root3)); // Should output 1


        // Test case 4: Skewed tree (all nodes on one side)
        Node root4 = new Node(8);
        root4.left = new Node(9);
        root4.left.left = new Node(10);
        root4.left.left.left = new Node(11);

        System.out.println("Height of tree is : " + tree.maxDepth(root4)); // Should output 4


    }
}
