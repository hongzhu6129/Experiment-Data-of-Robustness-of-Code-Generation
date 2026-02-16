class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaxDepthBinaryTree {

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
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);


        System.out.println("Height of tree is : " + tree.maxDepth(root));

        // Additional test case (single node tree)
         root = new Node(1);
         System.out.println("Height of tree is : " + tree.maxDepth(root));

          // Additional test case (empty tree)
        root = null;
        System.out.println("Height of tree is : " + tree.maxDepth(root));


    }
}
