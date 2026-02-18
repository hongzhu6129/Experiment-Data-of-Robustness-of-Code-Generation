class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeDepth tree = new BinaryTreeDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        System.out.println("Height/Max Depth of tree is : " + tree.maxDepth(root));


        // Example of a skewed tree (linked list like structure) where exceeds depth is more obvious:
        Node skewedRoot = new Node(1);
        skewedRoot.left = new Node(2);
        skewedRoot.left.left = new Node(3);
        skewedRoot.left.left.left = new Node(4);
        skewedRoot.left.left.left.left = new Node(5);  // Exceeds depth is becoming apparent

        System.out.println("Height/Max Depth of skewed tree is : " + tree.maxDepth(skewedRoot));

    }
}
