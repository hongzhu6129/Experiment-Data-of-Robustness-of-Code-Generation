class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaxDepthBinaryTree {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Recursively find the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger of the two depths + 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


    public static void main(String[] args) {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Additional test cases
        Node root2 = null; // Empty tree
        System.out.println("Height of tree is : " + tree.maxDepth(root2));

        Node root3 = new Node(1); // Single node tree
        System.out.println("Height of tree is : " + tree.maxDepth(root3));

          Node root4 = new Node(1);
        root4.left = new Node(2);
        root4.right = new Node(3);
        root4.left.left = new Node(4);
        root4.left.right = new Node(5);
        root4.left.left.left = new Node(6); // Deeper on left side

        System.out.println("Height of tree is : " + tree.maxDepth(root4));
    }
}
