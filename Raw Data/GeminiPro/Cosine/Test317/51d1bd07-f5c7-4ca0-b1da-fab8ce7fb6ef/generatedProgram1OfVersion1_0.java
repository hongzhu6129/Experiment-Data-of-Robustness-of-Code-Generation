import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class IdenticalBinaryTrees {

    public static void main(String[] args) {
        // Example usage:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(4); // Different value


        System.out.println("Tree 1 and Tree 2 are identical: " + isIdenticalTree(root1, root2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + isIdenticalTree(root1, root3)); // Output: false


        // Demonstrating is_Identical_tree_node usage
        System.out.println("Nodes at root of Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(root1, root2)); // true
        System.out.println("Nodes at root of Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(root1, root3)); // true (only checks the nodes themselves)


        //More Test Cases:
        TreeNode root4 = new TreeNode(1);
        TreeNode root5 = null;

        System.out.println("Tree 4 and Tree 5 are identical: "+ isIdenticalTree(root4,root5)); //false
        System.out.println("Tree 5 and Tree 4 are identical: "+ isIdenticalTree(root5,root4)); //false


    }



    // Main method to check if two trees are identical. Handles null cases as well.
    public static boolean isIdenticalTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }


        // Use either iterative or recursive approach below. Both are equivalent.
        return isIdenticalIterative(p,q); // or return isIdenticalRecursive(p, q);
    }



     // Iterative approach using a queue.  Generally preferred for larger trees
    // to avoid potential stack overflow issues in the recursive approach.
    private static boolean isIdenticalIterative(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();

            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;
            if (n1.val != n2.val) return false;

            queue.offer(n1.left);
            queue.offer(n2.left);
            queue.offer(n1.right);
            queue.offer(n2.right);
        }
        return true;

    }

    // Recursive approach (clearer for small trees but can lead to stack overflow
    // for very deep trees � the iterative approach is generally safer)
    private static boolean isIdenticalRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isIdenticalRecursive(p.left, q.left) &&
               isIdenticalRecursive(p.right, q.right);
    }




    // Helper function (as requested by the prompt � only checks the given nodes)
    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val;
    }
}
