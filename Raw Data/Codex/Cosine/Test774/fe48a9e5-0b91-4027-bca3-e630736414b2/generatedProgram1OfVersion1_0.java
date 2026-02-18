class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            // Get the depth of the left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the larger of the two depths, plus 1 for the current node
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Maximum depth of the tree is: " + solution.maxDepth(root)); // Output: 3


        // Another example (empty tree):
        Node emptyRoot = null;
        System.out.println("Maximum depth of the empty tree is: " + solution.maxDepth(emptyRoot)); // Output: 0


        // Another example (single node tree)
        Node singleNodeRoot = new Node(7);
        System.out.println("Maximum depth of the single node tree is: " + solution.maxDepth(singleNodeRoot)); // Output: 1


        // Example with a skewed tree
        Node skewedRoot = new Node(1);
        skewedRoot.left = new Node(2);
        skewedRoot.left.left = new Node(3);
        skewedRoot.left.left.left = new Node(4);

        System.out.println("Maximum depth of the skewed tree is: " + solution.maxDepth(skewedRoot)); // Output: 4

    }
}
