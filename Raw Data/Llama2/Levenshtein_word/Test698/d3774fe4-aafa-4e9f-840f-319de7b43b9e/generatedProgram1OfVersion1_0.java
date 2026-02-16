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
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(4); // Different value


        System.out.println("Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(tree1, tree2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(tree1, tree3)); // Output: false



         TreeNode tree4 = new TreeNode(1);
        tree4.left = new TreeNode(2);


        TreeNode tree5 = new TreeNode(1);
        tree5.left = new TreeNode(2);
         tree5.right = new TreeNode(3); // Different Structure


        System.out.println("Tree 4 and Tree 5 are identical: " + is_Identical_tree_node(tree4, tree5)); // Output: false

        System.out.println("Tree 4 and null are identical: " + is_Identical_tree_node(tree4, null)); // Output: false
        System.out.println("null and null are identical: " + is_Identical_tree_node(null, null)); // Output: true

    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // Both null, considered identical
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
