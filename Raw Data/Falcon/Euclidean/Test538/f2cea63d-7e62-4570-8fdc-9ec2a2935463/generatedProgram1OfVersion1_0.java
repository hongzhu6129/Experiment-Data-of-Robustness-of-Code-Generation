class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaxDepthBinaryTree {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }

    public static void main(String[] args) {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));


        // Additional test cases (you can add more)
        Node root2 = null; // Empty tree
        System.out.println("Height of tree is : " + tree.maxDepth(root2));


        Node root3 = new Node(7); // Single node tree
        System.out.println("Height of tree is : " + tree.maxDepth(root3));


        Node root4 = new Node(8);
        root4.left = new Node(9);
        root4.right = new Node(10);
        System.out.println("Height of tree is : " + tree.maxDepth(root4));

    }
}
