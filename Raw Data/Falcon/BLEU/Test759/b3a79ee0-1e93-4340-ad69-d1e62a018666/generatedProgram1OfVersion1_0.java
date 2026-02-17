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


        System.out.println("Tree 1 and Tree 2 identical: " + is_Identical_tree_node(root1, root2)); // Output: true
        System.out.println("Tree 1 and Tree 3 identical: " + is_Identical_tree_node(root1, root3)); // Output: false


        // Test for null trees
        System.out.println("Null trees identical: " + is_Identical_tree_node(null, null)); // Output: true

        TreeNode root4 = new TreeNode(1);
        System.out.println("One null tree: " + is_Identical_tree_node(root4, null)); // Output: false
        System.out.println("One null tree: " + is_Identical_tree_node(null, root4)); // Output: false


    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // Both null
        if (p == null && q == null) {
            return true;
        }
        // One is null, the other isn't
        if (p == null || q == null) {
            return false;
        }
        // Values don't match
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);
    }
}
