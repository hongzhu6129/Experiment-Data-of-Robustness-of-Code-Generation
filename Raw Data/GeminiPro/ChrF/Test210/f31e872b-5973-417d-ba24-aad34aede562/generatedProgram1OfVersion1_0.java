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
            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Another example
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.right.left = new Node(5);
        root2.right.right = new Node(6);
        root2.right.right.left = new Node(7);


        System.out.println("Height of tree is : " + tree.maxDepth(root2));
    }
}
