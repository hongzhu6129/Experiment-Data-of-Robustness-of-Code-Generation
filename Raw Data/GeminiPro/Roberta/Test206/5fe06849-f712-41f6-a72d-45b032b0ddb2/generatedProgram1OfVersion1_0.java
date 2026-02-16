class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
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


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Additional test cases
        Node root2 = null; // Empty tree
        System.out.println("Height of tree is : " + tree.maxDepth(root2)); // Expected: 0


        Node root3 = new Node(10);
        System.out.println("Height of tree is : " + tree.maxDepth(root3)); // Expected 1

         Node root4 = new Node(1);
        root4.left = new Node(2);
        root4.right = new Node(3);
        root4.left.left = new Node(4);
        root4.left.left.right = new Node(5);

        System.out.println("Height of tree is : " + tree.maxDepth(root4)); // Expected: 4

    }
}
