class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Compute the depth of each subtree
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            // Use the larger one
            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }
    }



    public static void main(String[] args) {
        BinaryTreeDepth tree = new BinaryTreeDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);


        System.out.println("Height of tree is : " + tree.maxDepth(root));

        // Example of a tree that exceeds a certain depth (let's say 5)
         root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6); // Depth 4
        root.left.left.left.left = new Node(7); // Depth 5
        root.left.left.left.left.left = new Node(8); // Depth exceeds 5


        if(tree.maxDepth(root)>5){
            System.out.println("Tree exceeds depth 5. Max Depth is : " + tree.maxDepth(root));
        } else {
            System.out.println("Tree does not exceed depth 5. Max Depth is : " + tree.maxDepth(root));
        }

    }
}
