class Node {
    int data;
    Node left, middle, right;

    public Node(int item) {
        data = item;
        left = middle = right = null;
    }
}

public class TernaryTreeMaxDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int middleDepth = maxDepth(node.middle);
            int rightDepth = maxDepth(node.right);

            return Math.max(leftDepth, Math.max(middleDepth, rightDepth)) + 1; 
        }
    }

    public static void main(String[] args) {
        TernaryTreeMaxDepth tree = new TernaryTreeMaxDepth();
        Node root = new Node(1);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.middle = new Node(6);
        root.left.right = new Node(7);


        System.out.println("Maximum depth/height of the tree is: " + tree.maxDepth(root));


         root = new Node(1);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(4);
        root.middle.left = new Node(5);
        root.middle.middle= new Node(6);
        root.middle.right = new Node(7); //Middle subtree is deepest
        System.out.println("Maximum depth/height of the tree is: " + tree.maxDepth(root));


        root = null; //Test empty tree
        System.out.println("Maximum depth/height of the tree is: " + tree.maxDepth(root));
    }
}
