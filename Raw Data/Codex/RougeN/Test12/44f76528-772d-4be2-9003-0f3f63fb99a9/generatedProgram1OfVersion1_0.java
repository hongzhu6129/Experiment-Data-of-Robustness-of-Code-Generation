class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeExceedsDepth {

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


    public static void main(String[] args) {
        BinaryTreeExceedsDepth tree = new BinaryTreeExceedsDepth();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6); // Exceeds depth


        int depth = tree.maxDepth(root);
        System.out.println("Max depth of the tree is : " + depth);


         //Example demonstrating "exceeds depth" concept
        int targetDepth = 2; //Let's say we want to find nodes beyond depth 2

        System.out.println("Nodes exceeding depth " + targetDepth + ":");
        tree.printNodesExceedingDepth(root, targetDepth, 0);



    }

    //Helper function to print nodes exceeding a given depth
    private void printNodesExceedingDepth(Node node, int targetDepth, int currentDepth) {
        if (node == null) {
            return;
        }

        currentDepth++;

        if (currentDepth > targetDepth) {
            System.out.println(node.data);
        }


        printNodesExceedingDepth(node.left, targetDepth, currentDepth);
        printNodesExceedingDepth(node.right, targetDepth, currentDepth);


    }
}
