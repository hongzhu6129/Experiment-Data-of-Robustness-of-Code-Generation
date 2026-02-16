class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeMaxDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Find the depth of left and right subtrees
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Return the larger depth plus 1 (for the current node)
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        System.out.println("Max depth of the tree is: " + tree.maxDepth(root));


        // Test case 2:  Empty Tree
        Node emptyRoot = null;
        System.out.println("Max depth of empty tree is: " + tree.maxDepth(emptyRoot));


         // Test case 3: Skewed Tree (left)
        Node skewedRootLeft = new Node(1);
        skewedRootLeft.left = new Node(2);
        skewedRootLeft.left.left = new Node(3);
        System.out.println("Max depth of skewed left tree is: " + tree.maxDepth(skewedRootLeft));

          // Test case 4: Skewed Tree (right)
        Node skewedRootRight = new Node(1);
        skewedRootRight.right = new Node(2);
        skewedRootRight.right.right = new Node(3);
        System.out.println("Max depth of skewed right tree is: " + tree.maxDepth(skewedRootRight));


    }
}



