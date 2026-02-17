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

            // Return the larger depth + 1 (for the current node)
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


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Example 2:  A skewed tree (like a linked list)
         Node skewedRoot = new Node(1);
         skewedRoot.left = new Node(2);
         skewedRoot.left.left = new Node(3);
         skewedRoot.left.left.left = new Node(4);


         System.out.println("Height of skewed tree is : " + tree.maxDepth(skewedRoot));
    }
}
