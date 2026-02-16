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

public class IdenticalTrees {

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

        // Test for null trees
        System.out.println("Two null trees are identical: " + is_Identical_tree_node(null, null)); //Output: true
        System.out.println("Tree1 and null are identical: " + is_Identical_tree_node(tree1, null)); //Output: false
        System.out.println("Null and Tree2 are identical: " + is_Identical_tree_node(null, tree2)); // Output: false


    }

    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // Both null, considered identical
        if (p == null && q == null) {
            return true;
        }

        // One is null, the other isn't, not identical
        if (p == null || q == null) {
            return false;
        }


        // If values are different, not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);

    }
}


