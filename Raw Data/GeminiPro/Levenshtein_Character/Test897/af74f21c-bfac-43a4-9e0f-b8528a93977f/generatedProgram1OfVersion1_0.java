class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        TreeNode root = sortedArrayToBST(nums);
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return creation(nums, 0, nums.length - 1);
    }

    private static TreeNode creation(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2; // Avoid potential overflow
        TreeNode node = new TreeNode(nums[mid]);

        node.left = creation(nums, left, mid - 1);
        node.right = creation(nums, mid + 1, right);

        return node;
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }
}
