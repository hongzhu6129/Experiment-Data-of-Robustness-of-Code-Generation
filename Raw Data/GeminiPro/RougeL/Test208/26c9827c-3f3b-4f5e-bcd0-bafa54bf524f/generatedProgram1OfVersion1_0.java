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
        }

        int leftDepth = maxDepth(node.left);
        int midDepth = maxDepth(node.mid);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, Math.max(midDepth, rightDepth)) + 1;
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
        System.out.println("Max depth: " + tree.maxDepth(root)); // Output: 3

         // Test case 2: Empty tree
        Node emptyRoot = null;
        System.out.println("Max depth of empty tree: " + tree.maxDepth(emptyRoot)); // Output: 0

        // Test case 3: Skewed tree
        Node skewedRoot = new Node(1);
        skewedRoot.left = new Node(2);
        skewedRoot.left.mid = new Node(3);
        skewedRoot.left.mid.right = new Node(4);
        System.out.println("Max depth of skewed tree: " + tree.maxDepth(skewedRoot)); // Output: 4

    }
}
