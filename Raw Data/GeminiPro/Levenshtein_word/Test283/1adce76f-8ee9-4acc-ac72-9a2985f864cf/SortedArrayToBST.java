import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root1 = sortedArrayToBST(nums1);
        System.out.println("BST from sorted array nums1:");
        traverseTree(root1);

        int[] nums2 = {-10, -3, 0, 5, 9};
        TreeNode root2 = sortedArrayToBST(nums2);
        System.out.println("\nBST from sorted array nums2:");
        traverseTree(root2);


        int[] nums3 = {};
        TreeNode root3 = sortedArrayToBST(nums3);
        System.out.println("\nBST from sorted array nums3 (empty):");
        traverseTree(root3);

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return creation(nums, 0, nums.length - 1);
    }

    private static TreeNode creation(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;  // Avoid potential overflow
        TreeNode root = new TreeNode(nums[mid]);

        root.left = creation(nums, start, mid - 1);
        root.right = creation(nums, mid + 1, end);

        return root;
    }


    private static void traverseTree(TreeNode root) {
        if (root == null) {
            return;
        }
        // Inorder traversal (will print the nodes in ascending order)
        traverseTree(root.left);
        System.out.print(root.val + " ");
        traverseTree(root.right);
    }
}




