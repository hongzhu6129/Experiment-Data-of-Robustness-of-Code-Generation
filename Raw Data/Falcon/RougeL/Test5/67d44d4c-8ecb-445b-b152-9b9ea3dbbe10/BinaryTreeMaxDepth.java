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
            // Compute the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Use the larger one
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);



        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Additional test cases
        Node root2 = null;  // Empty tree
        System.out.println("Height of tree is : " + tree.maxDepth(root2)); // Should print 0

        Node root3 = new Node(7); // Single node tree
        System.out.println("Height of tree is : " + tree.maxDepth(root3)); //Should print 1

        root.right.right = new Node(7); // Making the example tree unbalanced.
         System.out.println("Height of tree is : " + tree.maxDepth(root)); // Should print 3
    }
}
