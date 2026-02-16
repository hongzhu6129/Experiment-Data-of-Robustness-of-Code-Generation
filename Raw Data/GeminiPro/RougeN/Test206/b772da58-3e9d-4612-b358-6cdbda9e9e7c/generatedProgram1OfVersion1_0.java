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

            // Return the larger depth + 1 (for the current node)
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
        root.right.left = new Node(6);



        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Example 2:  A more skewed tree
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.left = new Node(3);
        root2.left.left.left = new Node(4);

        System.out.println("Height of tree 2 is : " + tree.maxDepth(root2));



    }
}
