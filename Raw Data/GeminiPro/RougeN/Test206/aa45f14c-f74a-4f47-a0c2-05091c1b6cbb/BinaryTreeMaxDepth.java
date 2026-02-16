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
        root.right.left = new Node(6);
        root.right.right= new Node(7);
        root.right.right.right=new Node(8);

        System.out.println("Maximum depth of the tree is: " + tree.maxDepth(root));


        // Additional test cases (optional)
        Node root2 = null; // Empty tree
        System.out.println("Maximum depth of empty tree: " + tree.maxDepth(root2)); 

        Node root3 = new Node(9); // Single node tree
        System.out.println("Maximum depth of single node tree: " + tree.maxDepth(root3));


    }
}
