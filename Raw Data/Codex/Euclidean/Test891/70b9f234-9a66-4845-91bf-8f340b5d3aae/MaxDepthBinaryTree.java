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
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }

    public static void main(String[] args) {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));

         // Another example:
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.right.left = new Node(5); // Right subtree also has a child

        System.out.println("Height of tree 2 is : " + tree.maxDepth(root2)); // Output should be 3


        // Example of an empty tree:
        Node root3 = null;
        System.out.println("Height of tree 3 (empty) is : " + tree.maxDepth(root3)); // Output should be 0
    }
}
