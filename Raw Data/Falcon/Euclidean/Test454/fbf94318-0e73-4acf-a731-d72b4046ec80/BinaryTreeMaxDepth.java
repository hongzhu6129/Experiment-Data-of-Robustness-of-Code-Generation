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

            // Return the larger depth and add 1 (for the current node)
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


        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));


        // Another test case (an empty tree):
        Node emptyRoot = null;
        System.out.println("Maximum depth of an empty tree is: " + tree.maxDepth(emptyRoot));


         //Another test case (a skewed tree):
         Node skewedRoot = new Node(1);
         skewedRoot.left = new Node(2);
         skewedRoot.left.left = new Node(3);
         skewedRoot.left.left.left = new Node(4);

         System.out.println("Maximum depth of a skewed tree is: " + tree.maxDepth(skewedRoot));



    }
}
