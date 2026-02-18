import java.util.Arrays;

public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 7;
        int[] position = Saddleback(arr, arr.length, arr[0].length, target);

        if (position[0] != -1) {
            System.out.println("Target " + target + " found at row: " + position[0] + ", column: " + position[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }


        target = 17; // Test for element not present
         position = Saddleback(arr, arr.length, arr[0].length, target);

        if (position[0] != -1) {
            System.out.println("Target " + target + " found at row: " + position[0] + ", column: " + position[1]);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

    private static int[] Saddleback(int[][] arr, int m, int n, int target) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Found, return row and column index
            } else if (arr[row][col] < target) {
                row++; // Target is greater, move down to the next row
            } else {
                col--; // Target is smaller, move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
