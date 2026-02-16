class Node {
    int data;
    Node left, mid, right;

    public Node(int item) {
        data = item;
        left = mid = right = null;
    }
}

public class TernaryTreeMaxDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(node.left);
            int midDepth = maxDepth(node.mid);
            int rightDepth = maxDepth(node.right);

            return Math.max(leftDepth, Math.max(midDepth, rightDepth)) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.mid = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.mid = new Node(6);
        root.left.right = new Node(7);


        TernaryTreeMaxDepth tree = new TernaryTreeMaxDepth();
        System.out.println("Maximum depth: " + tree.maxDepth(root)); // Output: 3


        // Another test case
        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.mid = new Node(30);
        root2.right = new Node(40);
        root2.left.mid = new Node(50);
        root2.right.left = new Node(60);
        root2.right.right = new Node(70);
        root2.right.right.left = new Node(80);

        System.out.println("Maximum depth: " + tree.maxDepth(root2)); // Output: 4
    }
}
