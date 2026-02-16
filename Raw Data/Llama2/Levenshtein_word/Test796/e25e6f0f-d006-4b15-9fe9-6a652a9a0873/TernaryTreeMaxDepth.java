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
        root.left.right= new Node(7);



        TernaryTreeMaxDepth tree = new TernaryTreeMaxDepth();
        System.out.println("Maximum depth: " + tree.maxDepth(root));


         root = new Node(10);
        root.left = new Node(20);
        root.mid = new Node(30);
        root.right = new Node(40);
        root.left.left = new Node(50);
        root.mid.mid = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(80);

        System.out.println("Maximum depth: " + tree.maxDepth(root));


    }
}
