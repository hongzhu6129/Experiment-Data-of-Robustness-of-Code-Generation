import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class SubtreeChecker {

    /**
     * Checks if 'subRoot' is a subtree of 'root'.
     *
     * @param root    The main tree's root node.
     * @param subRoot The potential subtree's root node.
     * @return True if 'subRoot' is a subtree of 'root', false otherwise.
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true; // An empty tree is a subtree of any tree.
        }
        if (root == null) {
            return false; // If the main tree is empty, but the subtree isn't, it's not a subtree.
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (areIdentical(node, subRoot)) {
                return true;
            }
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }

        return false; 
    }

    /**
     * Checks if two trees are identical.
     *
     * @param node1 The root of the first tree.
     * @param node2 The root of the second tree.
     * @return True if the trees are identical, false otherwise.
     */
    private boolean areIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return (node1.val == node2.val) &&
               areIdentical(node1.left, node2.left) &&
               areIdentical(node1.right, node2.right);
    }



    public static void main(String[] args) {
         // Example usage:
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        SubtreeChecker checker = new SubtreeChecker();
        boolean isSub = checker.isSubtree(root, subRoot);
        System.out.println("Is subtree: " + isSub); // Output: true

        subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(3); // Different value
        isSub = checker.isSubtree(root, subRoot);
        System.out.println("Is subtree: " + isSub); // Output: false


    }
}





