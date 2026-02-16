class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1; 
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Example tree construction (you can modify this)
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Maximum depth/height of the tree is: " + tree.maxDepth(tree.root));

        // Another example
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(10);
        tree2.root.left = new Node(20);
        tree2.root.right = new Node(30);
        tree2.root.left.left = new Node(40);
        tree2.root.left.left.left = new Node(50);

        System.out.println("Maximum depth/height of the second tree is: " + tree2.maxDepth(tree2.root));


    }
}
