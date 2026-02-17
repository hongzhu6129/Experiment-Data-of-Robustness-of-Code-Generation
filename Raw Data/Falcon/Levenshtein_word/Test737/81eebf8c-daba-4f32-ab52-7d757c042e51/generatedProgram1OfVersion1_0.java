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
            // Find the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger of the two depths + 1 (for the current node)
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
        root.right.left=new Node(6);

        System.out.println("Height/Max Depth of tree is : " + tree.maxDepth(root));


         root = new Node(1);     // Example 2:  Skewed Tree
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);

         System.out.println("Height/Max Depth of tree is : " + tree.maxDepth(root)); 
    }
}
