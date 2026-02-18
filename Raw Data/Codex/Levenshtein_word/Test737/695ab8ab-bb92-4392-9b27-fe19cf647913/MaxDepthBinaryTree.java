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
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

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
        root.right.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));

        // Example with a skewed tree (linked list like structure)
        Node skewedRoot = new Node(1);
        skewedRoot.right = new Node(2);
        skewedRoot.right.right = new Node(3);
        skewedRoot.right.right.right = new Node(4);

        System.out.println("Height of skewed tree is : " + tree.maxDepth(skewedRoot));


         // Example with an empty tree
         Node emptyRoot = null;
         System.out.println("Height of empty tree is : " + tree.maxDepth(emptyRoot));

    }
}
