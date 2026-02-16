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

        // Example tree creation (you can modify this to test other trees):
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        System.out.println("Max depth: " + tree.maxDepth(root)); // Output: 3
        
        // Another Example
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);


        System.out.println("Max depth: " + tree.maxDepth(root2)); // Output: 3



        Node root3 = null; //Empty Tree

        System.out.println("Max depth: " + tree.maxDepth(root3)); // Output: 0
    }
}
