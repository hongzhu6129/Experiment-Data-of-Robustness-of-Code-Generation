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
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);


        System.out.println("Max depth of the tree is: " + tree.maxDepth(root));



        // Additional test cases
         root = null;
        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Should be 0

         root = new Node(1);
        System.out.println("Max depth of the tree is: " + tree.maxDepth(root)); // Should be 1



    }
}
