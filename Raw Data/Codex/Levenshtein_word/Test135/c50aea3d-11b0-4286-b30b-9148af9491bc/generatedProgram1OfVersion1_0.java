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
            // Recursively calculate the depth of left and right subtrees
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger depth and add 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        // Example tree creation (you can modify this to test different trees)
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("Height of tree is : " + tree.maxDepth(root));

          // Another example:
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6); // Added a node to the right subtree
        root2.right.right = new Node(7); // Added a node to the right subtree
        root2.right.right.right = new Node(8);  // Deeper right subtree
        System.out.println("Height of tree 2 is : " + tree.maxDepth(root2)); 

         // Empty tree example:
        Node root3 = null; 
        System.out.println("Height of an empty tree is : " + tree.maxDepth(root3)); 
    }
}
