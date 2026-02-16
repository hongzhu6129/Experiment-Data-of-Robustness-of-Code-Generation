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
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
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
        root.left.right.left = new Node(6); // Adding a deeper node


        System.out.println("Height of tree is : " + tree.maxDepth(root));

        // Test case for an empty tree
        Node emptyRoot = null;
        System.out.println("Height of empty tree is : " + tree.maxDepth(emptyRoot));


        // Test case for a tree with only root node.
        Node singleNodeRoot = new Node(7);
        System.out.println("Height of single node tree is : " + tree.maxDepth(singleNodeRoot));



    }
}
