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
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            // Use the larger one
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }



    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6); // Added a node to the right subtree
        root.left.left.left = new Node(7); // Added a deeper node


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Test with an empty tree
        Node emptyRoot = null;
        System.out.println("Height of empty tree is: " + tree.maxDepth(emptyRoot));


        // Test with a single node tree
        Node singleNodeRoot = new Node(10);
         System.out.println("Height of single node tree is: " + tree.maxDepth(singleNodeRoot));

    }
}

