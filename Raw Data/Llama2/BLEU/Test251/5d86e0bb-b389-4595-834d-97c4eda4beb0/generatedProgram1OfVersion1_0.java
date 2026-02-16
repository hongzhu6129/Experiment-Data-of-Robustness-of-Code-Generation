import java.util.LinkedList;
import java.util.Queue;

public class CompareTreeBreak {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        //root2.left.right = new TreeNode(5); //Difference: missing node 5


        if (areTreesStructurallyEqual(root1, root2)) {
            System.out.println("The two trees are structurally identical (before break).");
        } else {
            System.out.println("The two trees are structurally different (after break).");
        }


    }

    public static boolean areTreesStructurallyEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false; // Structural difference (one exists, other doesn't)
        }

        // Use Breadth-First Search (BFS) for structure comparison
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(root1);
        q2.offer(root2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();

            // Check for structural difference: Children present in one and not in the other
            if ((node1.left != null && node2.left == null) || (node1.left == null && node2.left != null) ||
                (node1.right != null && node2.right == null) || (node1.right == null && node2.right != null)) {

                return false;

            }


            if (node1.left != null) {
                q1.offer(node1.left);
            }
            if (node1.right != null) {
                q1.offer(node1.right);
            }

             if (node2.left != null) {
                q2.offer(node2.left);
            }
            if (node2.right != null) {
                q2.offer(node2.right);
            }
        }

        return q1.isEmpty() && q2.isEmpty(); // Ensure both trees were fully traversed
    }
}
