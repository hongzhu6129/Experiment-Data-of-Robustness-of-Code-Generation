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
            // Recursively calculate the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger of the two subtree depths, plus 1 for the current node
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


        // Additional test case for an empty tree
         root = null;
        System.out.println("Height of empty tree is : " + tree.maxDepth(root));


        // Additional test case for a skewed tree
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);

        System.out.println("Height of skewed tree is : " + tree.maxDepth(root));
    }
}
