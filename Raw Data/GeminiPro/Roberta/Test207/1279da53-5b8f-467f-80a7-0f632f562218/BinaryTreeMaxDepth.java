class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeMaxDepth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            // Recursively find the depth of each subtree
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the larger of the two depths, plus 1 for the current node
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


        // Calculate and print the maximum depth
        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));


        //Test case 2:  Empty Tree
         root = null;
        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));


        //Test case 3: Skewed Tree
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));

    }
}
