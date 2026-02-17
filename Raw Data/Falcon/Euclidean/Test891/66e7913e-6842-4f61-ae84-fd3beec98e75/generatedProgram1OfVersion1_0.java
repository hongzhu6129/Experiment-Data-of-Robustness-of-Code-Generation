class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeMaxDepth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

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


        System.out.println("Max depth of tree is : " + tree.maxDepth(root));


        //  Additional test cases (optional)
         root = new Node(1);
         System.out.println("Max depth of tree is : " + tree.maxDepth(root)); // Should be 1

         root = null;
         System.out.println("Max depth of tree is : " + tree.maxDepth(root)); // Should be 0

         root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.right.left = new Node(5);
         root.right.right = new Node(6);
         root.right.right.left = new Node(7);
        System.out.println("Max depth of tree is : " + tree.maxDepth(root)); // Should be 4



    }
}
