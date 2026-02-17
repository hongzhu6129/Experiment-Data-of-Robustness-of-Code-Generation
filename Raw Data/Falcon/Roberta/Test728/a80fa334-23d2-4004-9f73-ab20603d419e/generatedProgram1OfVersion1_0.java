public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        int m = arr.length;
        int n = arr[0].length;

        int target = 15;

        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }


        target = 17; // Test for a number not in the array.
        result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }


    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Target found, return its position
            } else if (arr[row][col] > target) {
                col--; // Move left if the current element is greater than the target
            } else {
                row++; // Move down if the current element is smaller than the target
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
