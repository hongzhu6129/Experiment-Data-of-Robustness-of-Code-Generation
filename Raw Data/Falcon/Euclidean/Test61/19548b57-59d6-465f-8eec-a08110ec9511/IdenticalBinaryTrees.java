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

        System.out.println("Tree 1 and Tree 2 are identical: " + is_Identical_tree_node(root1, root2)); // Output: true
        System.out.println("Tree 1 and Tree 3 are identical: " + is_Identical_tree_node(root1, root3)); // Output: false



        // Demonstrating null handling and empty trees:
        TreeNode emptyTree1 = null;
        TreeNode emptyTree2 = null;
        TreeNode treeWithNullLeft = new TreeNode(5);
        TreeNode treeWithNullRight = new TreeNode(5);
        treeWithNullLeft.left = null;
        treeWithNullRight.right = null;



        System.out.println("Two null trees are identical: " + is_Identical_tree_node(emptyTree1, emptyTree2)); // Output: true
        System.out.println("Tree and null tree are identical: " + is_Identical_tree_node(root1, emptyTree1)); // Output: false
         System.out.println("Trees with null subtrees (different sides): " + is_Identical_tree_node(treeWithNullLeft, treeWithNullRight)); // Output: false


    }


    public static boolean is_Identical_tree_node(TreeNode p, TreeNode q) {
        // Both null, they are identical
        if (p == null && q == null) {
            return true;
        }

        // One is null, the other is not, not identical
        if (p == null || q == null) {
            return false;
        }


        // Values don't match, not identical
        if (p.val != q.val) {
            return false;
        }


        // Recursively check left and right subtrees
        return is_Identical_tree_node(p.left, q.left) && is_Identical_tree_node(p.right, q.right);
    }
}
