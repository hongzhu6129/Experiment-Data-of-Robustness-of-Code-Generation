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
            // Recursively compute the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Use the larger one
            return Math.max(leftDepth, rightDepth) + 1; // +1 for current node
        }
    }


    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

         // Example usage:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Another example (empty tree)
        Node emptyRoot = null;
        System.out.println("Height of empty tree is : " + tree.maxDepth(emptyRoot));


        // Example with single node tree
        Node singleNodeRoot = new Node(7);
        System.out.println("Height of single node tree is : " + tree.maxDepth(singleNodeRoot));
    }
}
