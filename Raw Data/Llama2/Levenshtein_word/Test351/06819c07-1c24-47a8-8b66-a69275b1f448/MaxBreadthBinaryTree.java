import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaxBreadthBinaryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int maxBreadth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            maxBreadth = Math.max(maxBreadth, levelSize); // Update maxBreadth

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }


        }

        return maxBreadth;
    }



    public static void main(String[] args) {
        MaxBreadthBinaryTree tree = new MaxBreadthBinaryTree();

        // Example tree construction:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        System.out.println("Maximum breadth of the tree is: " + tree.maxDepth(root));

        //Another test case
          Node root2 = new Node(1);
           root2.left = new Node(2);
           root2.right = new Node(3);
           root2.left.left = new Node(4);
           root2.left.right = new Node(5);

            System.out.println("Maximum breadth of the tree is: " + tree.maxDepth(root2));



    }
}
