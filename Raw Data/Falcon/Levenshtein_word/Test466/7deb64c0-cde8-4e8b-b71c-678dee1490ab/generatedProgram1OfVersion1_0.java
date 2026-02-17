import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public static void main(String[] args) {
        // Example tree (you can modify this to test different trees)
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Level Order Traversal (BFS):");
        levelOrderTraversal(root);

        System.out.println("\nPre-Order Traversal (DFS):");
        preOrderTraversal(root);

        System.out.println("\nIn-Order Traversal (DFS):");
        inOrderTraversal(root);

        System.out.println("\nPost-Order Traversal (DFS):");
        postOrderTraversal(root);
    }

    // Level-Order Traversal (Breadth-First Search)
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }


    // Pre-Order Traversal (Depth-First Search)
    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // In-Order Traversal (Depth-First Search)
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // Post-Order Traversal (Depth-First Search)
    public static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }


    // TreeNode inner class (for representing the tree)
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
