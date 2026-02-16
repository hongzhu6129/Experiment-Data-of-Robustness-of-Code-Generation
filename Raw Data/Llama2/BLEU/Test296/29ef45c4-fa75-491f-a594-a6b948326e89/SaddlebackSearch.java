import java.util.Arrays;

public class SaddlebackSearch {

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int m = array.length;
        int n = array[0].length;

        int target = 16;  // Example target value

        int[] result = Saddleback(array, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }


        target = 20; // Example target value that is not present
        result = Saddleback(array, target, m, n);

        if (result[0] != -1) {
            System.out.println("Target " + target + " found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    private static int[] Saddleback(int[][] array, int target, int m, int n) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (array[row][col] == target) {
                return new int[]{row, col}; // Target found
            } else if (array[row][col] < target) {
                row++; // Move down to the next row
            } else {
                col--; // Move left to the previous column
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
