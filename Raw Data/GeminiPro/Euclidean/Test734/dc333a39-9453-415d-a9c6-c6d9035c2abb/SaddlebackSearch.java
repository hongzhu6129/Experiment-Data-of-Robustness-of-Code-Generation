import java.util.Arrays;

public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int m = arr.length;
        int n = arr[0].length;

        int target = 17;
        int[] result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }


        target = 20; // Test with a value not present.
         result = Saddleback(arr, m, n, target);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Found
            } else if (arr[row][col] < target) {
                row++; // Target is greater, move down
            } else {
                col--; // Target is smaller, move left
            }
        }

        return new int[]{-1, -1}; // Not found
    }
}
