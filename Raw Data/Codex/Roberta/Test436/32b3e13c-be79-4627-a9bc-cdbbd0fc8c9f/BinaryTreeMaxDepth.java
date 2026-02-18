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
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6); // Added a deeper node


        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Output: 4

        // Another test case
        Node root2 = null;
        System.out.println("Max depth of the empty tree is: " + tree.maxDepth(root2)); // Output: 0


        Node root3 = new Node(7); // Single node tree
        System.out.println("Max depth of the single node tree is: " + tree.maxDepth(root3)); // Output 1


    }
}
