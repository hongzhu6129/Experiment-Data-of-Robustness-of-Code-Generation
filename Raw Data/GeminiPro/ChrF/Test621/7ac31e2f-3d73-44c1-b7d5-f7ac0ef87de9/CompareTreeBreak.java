import java.util.LinkedList;
import java.util.Queue;

public class CompareTreeBreak {

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
        root2.left.right = new TreeNode(6); // Difference here


        boolean areEqual = compareTrees(root1, root2);
        System.out.println("Are the trees equal (ignoring breaks)? " + areEqual);

          TreeNode root3 = new TreeNode(1); // Different structure
        root3.left = new TreeNode(2);

          areEqual = compareTrees(root1, root3);
          System.out.println("Are the trees equal (ignoring breaks)? " + areEqual);


        TreeNode root4 = null;  // Testing with null trees
        TreeNode root5 = null;
        areEqual = compareTrees(root4, root5);
        System.out.println("Are the trees equal (ignoring breaks)? " + areEqual);

        areEqual = compareTrees(root1, null); // One null, one non-null
        System.out.println("Are the trees equal (ignoring breaks)? " + areEqual);

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean compareTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;  // Both null, considered equal
        }
        if (t1 == null || t2 == null) {
            return false; // One null, one not null � different
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(t1);
        q2.offer(t2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();

            if (n1.val != n2.val) {
                return false;  // Values don't match
            }

            // Enqueue children if they exist, handling potential breaks (null children)
            if (n1.left != null && n2.left!= null) {
                q1.offer(n1.left);
                q2.offer(n2.left);
            } else if (n1.left != null || n2.left != null) { // Only one has a left child
                return false;
            }

            if (n1.right != null && n2.right!= null) {
                q1.offer(n1.right);
                q2.offer(n2.right);
            } else if(n1.right != null || n2.right != null){  // Only one has a right child
                return false;
            }

        }

        return q1.isEmpty() && q2.isEmpty(); // Both queues should be empty if they were equal
    }




}
