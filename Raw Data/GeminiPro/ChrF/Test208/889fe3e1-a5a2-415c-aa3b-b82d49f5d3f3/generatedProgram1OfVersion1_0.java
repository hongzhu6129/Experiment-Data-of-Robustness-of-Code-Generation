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
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            return Math.max(leftDepth, rightDepth) + 1; 
        }
    }

    public static void main(String[] args) {
        BinaryTreeDepth tree = new BinaryTreeDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("The Maximum depth of the binary tree is: " + tree.maxDepth(root));


         // Another test case
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.left.left = new Node(5); // Deeper on the left

        System.out.println("The Maximum depth of the binary tree is: " + tree.maxDepth(root2));



    }
}
